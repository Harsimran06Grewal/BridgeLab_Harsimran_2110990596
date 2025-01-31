public class SmallestNumber {
    //function to find smallest element in the array
    static void smallest(int arr[]){
        int mini = Integer.MAX_VALUE;

        for(int i = 0; i <arr.length; i++){
            if(mini > arr[i]){
                mini = arr[i];
            }
        }

        System.out.println(mini);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 100, 0};

        smallest(arr);
    }
}
