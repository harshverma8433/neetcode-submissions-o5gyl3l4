class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i] + numbers[j] == target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
                    
        // return new int[]{-1,-1};


        for(int i=0;i<numbers.length;i++){
            int l = i+1;
            int r = numbers.length-1;
            int found = target-numbers[i];
            while(l<=r){
                int mid = (l+r)/2;
                if(numbers[mid] == found){
                    return new int[]{i+1,mid+1};
                }else if(numbers[mid] > found){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }


        }


        return new int[] {-1,-1};

    }
}
