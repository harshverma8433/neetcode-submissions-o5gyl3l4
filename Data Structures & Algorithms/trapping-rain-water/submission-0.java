class Solution {

    public int leftMaxFun(int[] height, int left){
            int max = height[left];
        for(int i=left-1;i>=0;i--){
            if(height[i] > max){
                max = height[i];
            }
        }

        return max;
    }

    public int rightMaxFun(int[] height,int right){
            int max = height[right];
          for(int i=right+1;i<height.length;i++){
            if(height[i] > max){
                max = height[i];
            }
        }

        return max;
    }

    public int trap(int[] height) {
        int total = 0;
        for(int i=0;i<height.length;i++){
            int leftMax = leftMaxFun(height,i);
            int rightMax = rightMaxFun(height,i);
            if(height[i] < leftMax && height[i] < rightMax){
                int minHeight = Math.min(leftMax , rightMax);
                total += (minHeight-height[i]);
            }

        }


        return total;
    }
}
