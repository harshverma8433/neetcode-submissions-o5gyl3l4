class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min_stack;


    public MinStack() {
        stack = new Stack<>();
        min_stack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
        if(min_stack.isEmpty() || (val <= min_stack.peek()) ){
            min_stack.push(val);
        }
    }
    
    public void pop() {
        // if(stack.isEmpty()) return;
        int v = stack.pop();
        if(v == min_stack.peek()){
            min_stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        // int min = stack.peek();
        // for(int i=0;i<stack.size();i++){
        //     if(stack.get(i) < min){
        //         min = stack.get(i);
        //     }
        // }
        // return min;
        // Stack<Integer> sec_stack = new Stack<>();
        //  int min = stack.peek();

        // while (!stack.isEmpty()) {
        //     min = Math.min(min, stack.peek());
        //     sec_stack.push(stack.pop());
        // }

        // while (!sec_stack.isEmpty()) {
        //     stack.push(sec_stack.pop());
        // }

        // return min;


        return min_stack.peek();
    }
}
