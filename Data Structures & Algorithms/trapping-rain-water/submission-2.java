class Solution {

    // public int leftMaxFun(int[] height, int left){
    //         int max = height[left];
    //     for(int i=left-1;i>=0;i--){
    //         if(height[i] > max){
    //             max = height[i];
    //         }
    //     }

    //     return max;
    // }

    // public int rightMaxFun(int[] height,int right){
    //         int max = height[right];
    //       for(int i=right+1;i<height.length;i++){
    //         if(height[i] > max){
    //             max = height[i];
    //         }
    //     }

    //     return max;
    // }

    public int trap(int[] height) {
        // int total = 0;
        // for(int i=0;i<height.length;i++){

        //     int[] prefixArr = new int[height.length];
            
        //     int leftMax = leftMaxFun(height,i);
        //     int rightMax = rightMaxFun(height,i);
        //     if(height[i] < leftMax && height[i] < rightMax){
        //         int minHeight = Math.min(leftMax , rightMax);
        //         total += (minHeight-height[i]);
        //     }

        // }


        // return total;

                   
        
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int total = 0;
        for(int i = 0; i < height.length; i++){
            total += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return total;
    }
}
