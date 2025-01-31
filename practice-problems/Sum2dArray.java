import java.util.*;

class Sum2DArray{
    //function to print sum of 2d array
    static void sum(int arr[][]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
    public static void main(String args[]){
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        sum(arr);
    }
}