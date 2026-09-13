class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //1. where is the target
        //2. where each car is (position) --> no car can start at the same place
        //3. how fast is it going (speed)

        //outputs an int (how much waves of cars got there)
        //the car on a position behind a car in the front can never surpass the front car

        //to verify if they got to destination [position] and [target] must be equal
        //-> use a counter to see how many waves got to the destination 
        //-> after each iteration (imagine iteration to be equivalent to an hour) of the loop the car will have moved [speed] units (because speed is in mph == positions per iteration)

        //Using a stack here because we need to see the order of which car gets there first? 
        //each index of array position represents an individual car
        //only way for a car to catch up is at the destination (i think)
        //we can measure the order of who got there first by the number of iterations per car (if the num of iterations of 2 cars are equal it means they got there tgt)

        //Approaching the problem

        Stack<Double> st = new Stack<>();
        int[] arr =  new int[position.length];
        int[][] cars = new int[position.length][2];

        for (int i = 0; i < position.length; i++){
            cars[i] = new int[]{position[i], speed[i]};
        }
        
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < cars.length; i++){
            int steps = 0;//how much iterations/hours the car took to destination
            int currentPosition = cars[i][0];
            int currentSpeed = cars[i][1];

            double time = (double)(target - currentPosition)/currentSpeed;

            if (st.isEmpty() || time > st.peek()) {
                st.push(time);
            }
            
}return st.size();
    }
}
