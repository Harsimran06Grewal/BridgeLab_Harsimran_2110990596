public class SubArraysSum {
    //function to maximum of subarrays
    static void maxSubArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            for(int j = i; j < arr.length; j++){
                currSum += arr[j];
                if(max < currSum){
                    max = currSum;
                }
                if(min > currSum){
                    min = currSum;
                }
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        maxSubArray(arr);
    }
}
