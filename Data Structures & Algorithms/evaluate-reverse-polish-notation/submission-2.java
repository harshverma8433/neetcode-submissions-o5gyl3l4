class Solution {
    public int evalRPN(String[] tokens) {
        // Stack<Integer> stack = new Stack<>();
        // for(int i=0;i<tokens.length;i++){
        //     if (!tokens[i].equals("+") && !tokens[i].equals("-") && 
        //         !tokens[i].equals("*") && !tokens[i].equals("/")) {
        //         stack.push(Integer.parseInt(tokens[i]));
        //     } else{
        //         int a = stack.pop();
        //         int b = stack.pop();
                
        //         if(tokens[i].equals("+")){
        //             stack.push(a+b);
        //         }
        //         if(tokens[i].equals("/")){
        //             stack.push(b/a);
        //         }
        //         if(tokens[i].equals("*")){
        //             stack.push(a*b);
        //         }
        //         if(tokens[i].equals("-")){
        //             stack.push(b-a);
        //         }
        //     }
        // }

        // return stack.pop();

         Stack<Integer>stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                int a=stack.pop();
                int b=stack.pop();
            
                stack.push(b+a);}
            else if(token.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
            
                stack.push(b-a);}
            else if(token.equals("*")){
                int a=stack.pop();
                int b=stack.pop();
            
            stack.push(b*a);}
            else if(token.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
            
            stack.push(b/a);}
            else{
                stack.push(Integer.parseInt(token));
            }
            
        }
        return stack.peek();
    }
}
