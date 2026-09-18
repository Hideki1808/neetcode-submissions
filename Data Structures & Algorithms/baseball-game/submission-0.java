class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++){
            
            if (stack.isEmpty()){
                stack.push(Integer.parseInt(operations[i]));
            } else if (operations[i].equals("+")){
                int temp = stack.pop();
                int sum = stack.peek() + temp;
                stack.push(temp);
                stack.push(sum);
            } else if (operations[i].equals("D")){
                stack.push(stack.peek()*2);
            } else if (operations[i].equals("C")){
                stack.pop();
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
            
        }
        int output = 0;
        while (!stack.isEmpty()){
            //int temp = stack.pop();
            output += stack.pop();
        }
        return output;
    }
}