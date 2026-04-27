class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] arr = new double[position.length][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }



        Arrays.sort(arr , (a,b) -> Double.compare(a[0], b[0]));

        double[] timeTaken = new double[position.length];

        for(int i=0;i<arr.length;i++){  
            double dist = target - arr[i][0];
            double s = arr[i][1];
            timeTaken[i] = dist/s;
        }

        int total_fleets = 0;
        double curr = 0;
        for(int i=timeTaken.length-1;i>=0;i--){
            if(timeTaken[i] > curr){
                total_fleets++;
                curr = timeTaken[i];
            }
        }

        return total_fleets;




    }
}