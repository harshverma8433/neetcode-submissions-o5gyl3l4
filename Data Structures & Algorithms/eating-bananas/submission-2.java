public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 1;
       int right = Arrays.stream(piles).max().getAsInt();
       int result = right;
       while(left<=right){
        int mid = left + (right-left)/2;
        int total = 0;
        for(int i : piles){ 
            total += Math.ceil((double) i/mid);
        }

        if(total <= h){
            result = mid;
            right = mid-1;
        }else{
            left =mid+1;
        }
       }

       return result;
    }
}