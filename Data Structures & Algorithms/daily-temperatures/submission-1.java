class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] daysArr = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            int days = 0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j] > temperatures[i]){
                    days = j - i;
                    break;
                }
            }

            daysArr[i] = days;
            days = 0;
        }


        return daysArr;
    }
}
