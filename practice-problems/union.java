public class union {
    void unionArr(int arr1[], int arr2[]){
        int arr3[] = new int[arr1.length + arr2.length];
        int index = 0;

        for(int i = 0; i < arr1.length; i++){
            arr3[index++] = arr1[i];
        }

        for(int j = 0; j < arr2.length; j++){
            boolean isfound = false;
            for(int k = 0; k < index; k++){
                 if(arr3[k] == arr2[j]){
                    isfound = true;
                }
            }
            if(!isfound){
                arr3[index++] = arr2[j];
            }
        }


        for(int i = 0; i < index; i++){
            System.out.println(arr3[i]);
        }

    }
    public static void main(String args[]){
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {3, 4, 5, 6};

        union u = new union();
        u.unionArr(arr1, arr2);
    }
}
