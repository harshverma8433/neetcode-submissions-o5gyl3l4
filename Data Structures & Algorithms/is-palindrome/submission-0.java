class Solution {
    public boolean isPalindrome(String s) {

       StringBuilder str = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        
         
        String ori_str = str.toString();
        String rev_str = str.reverse().toString();
        
        if(ori_str.equals(rev_str)){
            return true;
        }

        return false;
    }
}
