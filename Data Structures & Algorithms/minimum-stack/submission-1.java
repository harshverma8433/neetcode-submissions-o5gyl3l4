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
        // int min = stack.peek();
        // for(int i=0;i<stack.size();i++){
        //     if(stack.get(i) < min){
        //         min = stack.get(i);
        //     }
        // }
        // return min;
        Stack<Integer> sec_stack = new Stack<>();
        int min = stack.peek();
        sec_stack.push(stack.pop());
        while(!stack.isEmpty()){
            int val = stack.peek();
            sec_stack.push(stack.pop());
            if(val < min){
                min = val;
            }

        }

        while(!sec_stack.isEmpty()){
            stack.push(sec_stack.pop());
        }


        return min;
    }
}
