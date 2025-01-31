public class MergeArray {
    //function to merge two arrays in zig zag order
    static void merge(int arr1[], int arr2[]){
        int arr3[] = new int[arr1.length + arr2.length];
        int index = 0;

        //loop to merge both the arrays
        for(int i = 0; i < arr1.length; i++){
            arr3[index++] = arr1[i];
            arr3[index++] = arr2[i];
        }

        //printing the merged array
        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }
    public static void main(String args[]){
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {5, 6, 7, 8};

        merge(arr1, arr2);
    }
}
