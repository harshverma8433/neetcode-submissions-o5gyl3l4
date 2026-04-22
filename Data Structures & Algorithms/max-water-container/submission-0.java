class Solution {
    public int maxArea(int[] heights) {
        int max_area = 0;

        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int fill = Math.min(heights[i],heights[j]);
                int area = fill * (j-i);
                if(max_area < area){
                    max_area = area;
                }
            }
        }


        return max_area;

    }
}
