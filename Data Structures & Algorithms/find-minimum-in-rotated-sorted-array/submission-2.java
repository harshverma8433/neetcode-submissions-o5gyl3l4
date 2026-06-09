class Solution {
    public int findMin(int[] nums) {
        // int mini = Integer.MAX_VALUE;
        // int l = 0;
        // int r = nums.length-1;
        // while(l<=r){
        //     int mid = (l+r)/2;
        //     if(nums[mid] < mini){
        //         mini = nums[mid];
        //         l = mid+1;
        //     }else if(nums[mid] > mini){
        //         r = mid-1;
        //     }
        // }

        // return mini;

      Arrays.sort(nums);
      return nums[0];
        

    }
}
