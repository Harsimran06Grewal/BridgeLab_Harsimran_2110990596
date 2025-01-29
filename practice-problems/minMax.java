import java.util.*;

public class minMax{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //enter the value of n
        System.out.println("enter the value of n: ");
        int n = in.nextInt();

        //initialing array
        int arr[] = new int[n];

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        //taking input of elements in array
        System.out.println("enter the elements for array: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        //calculating min and max element
        for(int i = 0; i < n; i++){
                if(maxi < arr[i]){
                    maxi = arr[i];
                }
                if(mini > arr[i]){
                    mini = arr[i];
                }
        }

        System.out.println("maximum element is: " + maxi);
        System.out.println("minimum element is: " + mini);
    }
}