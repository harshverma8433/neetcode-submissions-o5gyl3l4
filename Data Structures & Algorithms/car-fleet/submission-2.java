class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr , (a,b) -> Integer.compare(b[0], a[0]));

        // double[] timeTaken = new double[position.length];

        // for(int i=0;i<arr.length;i++){  
        //     double dist = target - arr[i][0];
        //     double s = arr[i][1];
        //     timeTaken[i] = dist/s;
        // }


        Stack<Double> stack = new Stack<>();
        for(int[] i : arr){
            double time = (double) (target - i[0])/i[1];
            // if (stack.size() >= 2 &&
            //     stack.peek() <= stack.get(stack.size() - 2))
            // {
            //     stack.pop();
            // }
             if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

        }

        return stack.size();




    }
}