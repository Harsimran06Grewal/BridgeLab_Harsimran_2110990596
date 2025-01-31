public class MoveZerosLeft {
    //function to move zeroes to left 
    static void moveZeroesLeft(int arr[]){
       int j = arr.length - 1;

       // loop to swap if element at zeoth index is not equal to zero
       for(int i = arr.length - 1; i >= 0; i--){
        if(arr[i] != 0){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
    }
       
        //loop for printing array
        System.out.println("array after moving zeroes to left : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 0, 3, 0, 5, 0, 2};

        moveZeroesLeft(arr);

    }
}
