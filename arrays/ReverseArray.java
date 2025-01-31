public class ReverseArray {
    //function to reverse an array
    static void reverse(int arr[]){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    //another way to reverse an array
    static void reverse1(int arr[]){
        int start = 0; 
        int end = arr.length - 1;

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        reverse1(arr);
    }
}
