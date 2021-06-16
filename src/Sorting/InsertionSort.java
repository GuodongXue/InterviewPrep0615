package Sorting;

public class InsertionSort {
    public static void insertSort(int[] arr){
        int insertVal = 0;
        int insertIndex = 0;
        for(int i = 1; i<arr.length; i++){
            insertVal = arr[i];
            insertIndex = i-1;

            while(insertIndex>=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1]= arr[insertIndex];
                insertIndex--;

            }
            if(insertIndex + 1 != i){
                arr[insertIndex+1] = insertVal;
            }

        }





    }
}
