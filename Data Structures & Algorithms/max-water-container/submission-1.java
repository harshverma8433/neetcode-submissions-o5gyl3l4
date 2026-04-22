class Solution {
    public int maxArea(int[] heights) {
        // int max_area = 0;

        // for(int i=0;i<heights.length;i++){
        //     for(int j=i+1;j<heights.length;j++){
        //         int fill = Math.min(heights[i],heights[j]);
        //         int area = fill * (j-i);
        //         if(max_area < area){
        //             max_area = area;
        //         }
        //     }
        // }


        // return max_area;

        int left = 0;
        int right = heights.length-1;
        int max_area = 0;

        while(left < right){
            int min = Math.min(heights[left] , heights[right]);
            int breadth = right-left;
            int area = min*breadth;
            if(area>max_area){
                max_area = area;
            }

            else if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_area;
    }
}
