class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        // HashMap<Character,Integer> map = new HashMap<>();
        // HashMap<Character,Integer> map1 = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         int v = map.get(s.charAt(i));
        //         map.put(s.charAt(i),v+1);
        //     }else{
        //         map.put(s.charAt(i),1);

        //     }
        // }
        
        // for(int i=0;i<t.length();i++){
        //     if(map1.containsKey(t.charAt(i))){
        //         int v = map1.get(t.charAt(i));
        //         map1.put(t.charAt(i),v+1);
        //     }else{
        //         map1.put(t.charAt(i),1);

        //     }
        // }
        
         
            

        

        //  for(Map.Entry<Character,Integer> entry : map.entrySet()){
        //     char key = entry.getKey();
        //     if(!map1.containsKey(key)){
        //         return false;
        //     }else{
        //         int val = entry.getValue();
        //         int val1 = map1.get(key);
        //         if(val != val1){
        //             return false;
        //         }
        //     }


        // }

        // return map1.equals(map);



    //     String[] arr1 = s.split("");
    //     String[] arr2 = t.split("");
    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);
       
    //    s = String.join("" , arr1);
    //    t = String.join("" , arr2);
       
    //     if(s.equals(t)){
    //         return true;
    //     }
    //     return false;


     if(s.length() != t.length()){
            return false;
        }

        int[] count_char = new int[26];
    
        for(int i=0;i<s.length();i++){
            count_char[s.charAt(i) - 'a']++;
            count_char[t.charAt(i) - 'a']--;

        }
    
        for(int a:count_char){
            if(a!=0){
                return false;
            }
        }
    
        
        return true;



    }
}
