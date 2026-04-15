class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String[] arr = strs[i].split("");
            Arrays.sort(arr);
            String sorted = String.join("",arr);

            if(map.containsKey(sorted)){
                List<String> l = map.get(sorted);
                l.add(strs[i]);
                map.put(sorted , l);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted , list);
            }

        }

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}
