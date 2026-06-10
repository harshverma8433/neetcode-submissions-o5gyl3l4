class Solution {
    public int findMin(int[] nums) {
        // int min = nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] < min){
        //         min = nums[i];
        //         break;
        //     }
        // }

        // return min;

       int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
             if(nums[right] < nums[mid]){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return nums[left];


    }
}
