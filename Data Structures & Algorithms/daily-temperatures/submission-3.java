class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int[] daysArr = new int[temperatures.length];
        // for(int i = 0;i<temperatures.length;i++){
        //     int days = 0;
        //     for(int j=i+1;j<temperatures.length;j++){
        //         if(temperatures[j] > temperatures[i]){
        //             days = j - i;
        //             break;
        //         }
        //     }

        //     daysArr[i] = days;
        //     days = 0;
        // }


        // return daysArr;

        Stack<Integer> stack = new Stack<>();
        stack.push(temperatures.length-1);
        int[] result = new int[temperatures.length];

        for(int i=temperatures.length-2;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i] ){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
                stack.push(i);
            }else{
                stack.push(i);
                result[i] = 0;
            }
        }


        return result;
    }
}
