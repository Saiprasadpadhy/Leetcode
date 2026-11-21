class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    //public MinStack() {}
    
    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty()) {
            minStack.push(value);
        }else if (value <= minStack.peek()) {
            minStack.push(value);
        }else {
            minStack.push(minStack.peek());
        }

    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */