class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<tokens.length; i++){
            String x = tokens[i];

            /*if (tokens[i] == Integer.parseInt(tokens[i])){
                stack.push(int(tokens[i]));
            } */

            if (x.equals("+")||x.equals("-")||x.equals("*")||x.equals("/")){
                int lOp = stack.pop();
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
                
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
