public class LargestNumber {
    //function to find largest element in array
    static void largest(int arr[]){
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
    }
    public static void main(String[] args) {
        int arr[] = {1, 10, 5, 100, 35};

        largest(arr);
    }
}
