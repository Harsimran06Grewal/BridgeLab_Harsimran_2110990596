import java.util.*;

public class frequency {
    //function to get frequency of elements in array
    void freq(int arr[]){
        //sort the array
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            //to skip the already counted elements
            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }

            //initialsing count to 1
            int count = 1;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            System.out.println(arr[i] + " " + count);
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 1, 2, 3, 4, 5, 6};
        frequency f = new frequency();
        f.freq(arr);
    }
}
