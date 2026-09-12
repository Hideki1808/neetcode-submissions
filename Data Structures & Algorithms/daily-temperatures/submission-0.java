class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] days = new int[temperatures.length];
        
        for (int i = 0; i < temperatures.length; i++){
            
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){ //while stack IS NOT empty (has something inside) AND temperature at i > temperature at the top of stack (most recently added) 
                int prevIndex = st.pop();//if the temp i is higher it means we found a hotter day, so we need to take the previous value out of the stack. For that we use pop() and store that value into an int
                days[prevIndex] = i - prevIndex;//here we do the "delta" calculation. If we were at [0] originally, it means temperatures[i] = 0 (we started at day 0) and it only took one day to get a higher temp. So we use the formula (present day) - (initial day) = (days waited)/

            }
            st.push(i);//when we start at 0 the stack will be empty, therefore the while loop WILL NOT be executed.
        }
        return days;
    }
}
