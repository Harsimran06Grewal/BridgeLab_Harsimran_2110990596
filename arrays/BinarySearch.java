public class BinarySearch {
    //function to search an element using binary search
    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 5;

        System.out.println(binarySearch(arr, target));
    }
}
