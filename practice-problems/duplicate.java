import java.util.*;

class duplicate{

    //function to remove duplictes from the array
    void removeDuplicate(int arr[]){
        //creating a new array
        int arr1[] = new int[arr.length];

        //intialising new array index starting with 0
        int index = 0;

        //sorting the array
        Arrays.sort(arr);

        //loop for adding unique elements to array
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1]){
                arr1[index++] = arr[i];
            }
        }

        //adding last element to new array
        arr1[index] = arr[arr.length - 1];

        //printing the new array
        for(int i = 0; i <= index; i++){
            System.out.println(arr1[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 3, 3, 2, 5};
        duplicate d = new duplicate();
        d.removeDuplicate(arr);
    }
}