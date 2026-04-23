class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.empty()){
                    return false;
                }
                char peek = stack.pop();
                if( !(s.charAt(i) == ']' && peek == '[') && !(s.charAt(i) == '}' && peek == '{') &&  !(s.charAt(i) == ')' && peek == '(')){
                    return false;
                }
            }
        } 

        while(!stack.empty()){
            return false;
        }

        return true;
    }
}
