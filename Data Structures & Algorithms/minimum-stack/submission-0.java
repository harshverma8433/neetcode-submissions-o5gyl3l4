class MinStack {

    Stack<Integer> stack;


    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int min = stack.peek();
        for(int i=0;i<stack.size();i++){
            if(stack.get(i) < min){
                min = stack.get(i);
            }
        }
        return min;
    }
}
