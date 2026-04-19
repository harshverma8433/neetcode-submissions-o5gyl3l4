class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        int longest = 1;

        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            int count = 1;

            boolean found = true;

            while(found){
                found = false;

                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == x + 1){
                        count++;
                        x = x + 1;
                        found = true;
                        break;
                    }
                }
            }

            if(count > longest){
                longest = count;
            }
        }

        return longest;
    }
}