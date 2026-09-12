class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<tokens.length; i++){
            String x = tokens[i];

            /*if (tokens[i] == Integer.parseInt(tokens[i])){
                stack.push(int(tokens[i]));
            } */

            if (x.equals("+")||x.equals("-")||x.equals("*")||x.equals("/")){//first we check "is the string at [i] one of those operators?" if so, see which and pull the first and second number of the stack and execute whatever operation is identified with both and PUSH THE RESULT OF THE OPERATION BACK IN THE STACK -> this "takes" one number out of the list (by combinig 2 and obtaining only 1)
                int lOp = stack.pop(); //order here matters (left Operator first)
                int rOp = stack.pop();

                switch (x){
                    case "+":
                        stack.push(rOp + lOp);
                        break;
                    case "-":
                        stack.push(rOp - lOp);
                        break;
                    case "*":
                        stack.push(rOp * lOp);
                        break;
                    case "/":
                        stack.push(rOp/lOp);
                        break;
                    
                }
            } else { 
                
                stack.push(Integer.parseInt(tokens[i]));//if the string in at [i] isn't a operation it WILL FOR SURE BE A NUMBER, so we use "Integer.parseInt()" in order to convert the string in the array to a valid int
            }
        }
        return stack.peek();//at the end we should end up with only one number in the stack (since we kept doing operations and combining all numbers until we got a single final result)
    }
}
