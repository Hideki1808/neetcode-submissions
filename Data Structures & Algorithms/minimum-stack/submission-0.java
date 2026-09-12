class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);//pushes val into stack normally

        if(minStack.isEmpty()||val <= minStack.peek()){ //if the top value of minStack is less than val, val WON'T be added (because minStack only tracks the smallest numbers). However if it is smaller, minStack adds and it will become the new "top" of minStack, meaning the smalles possible num. 
            minStack.push(val);
        }
    }
    
    public void pop() {//we want to delete the top most value (latest added) from both minStack and Stack, because the main stack is what we're tracking normally, but if the value is also the overall minimum we need to delete it from the minStack so the second in line can take the place as "min value", since the original one is not supposed to exist anymore in Sxtack (and theoretically all values for minStack should come from stack)
        int deleted = stack.pop();

        if (deleted == minStack.peek()){ 
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
}
}
