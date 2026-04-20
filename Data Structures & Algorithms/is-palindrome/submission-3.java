class Solution {
    public boolean isPalindrome(String s) {

    //    StringBuilder str = new StringBuilder();
    //     for(char c:s.toCharArray()){
    //         if(Character.isLetterOrDigit(c)){
    //             str.append(Character.toLowerCase(c));
    //         }
    //     }
         
    //     String ori_str = str.toString();
    //     String rev_str = str.reverse().toString();
        
    //     if(ori_str.equals(rev_str)){
    //         return true;
    //     }

    //     return false;



    // char[] arr = s.toLowerCase().toCharArray();
    // String ori_str = "";
    // for(char c : arr){
       
    //     if((c>='a' && c<='z') || (c>='0' && c<='9') ){
    //         ori_str += c;
    //     }
    // }
    
    // String rev_str = "";
    // for(int i=ori_str.length()-1 ; i>=0;i--){
    //     rev_str += ori_str.charAt(i);
    // }

    //     if(ori_str.equals(rev_str)){
    //         return true;
    //     }

    //     return false;


    int l = 0;
    int r = s.length()-1;
    while (l < r) {
            while( l<r &&  !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while( l<r &&  !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;

    }
}
