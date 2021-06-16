package Sorting;

public class SelectionSort {
    public static int[] selection(int[] arr){

        for(int i = 0; i<arr.length-1; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j = i; j<arr.length; j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }

}
