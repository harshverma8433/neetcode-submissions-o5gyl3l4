class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> list = new ArrayList<>();
        // for(int i=0;i<nums.length-2;i++){
        //     for(int j=i+1;j<nums.length-1;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);
        //                 Collections.sort(l);
        //                 if(!list.contains(l)){
        //                     list.add(l);
        //                 }
        //             }
        //         }
        //     }
        // }

        // return list;



        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> l = new ArrayList<>();
                    Collections.addAll(l , nums[i] , nums[left] , nums[right] );
                    if(!list.contains(l)){
                            list.add(l);
                    }
                    left++;
                    right--;
                }else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return list;
    }
}


