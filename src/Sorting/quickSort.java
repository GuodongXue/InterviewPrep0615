package Sorting;

public class quickSort {
    public static void quickSort(int[] arr, int begin, int end){
        if(begin < end){
               int partitionIndex = partition(arr, begin, end);
               quickSort(arr, begin, partitionIndex-1);
               quickSort(arr, partitionIndex+1, end);
        }
    }
    private static int partition(int[] arr, int begin, int end){
        int pivot = arr[end];
        int i = begin-1;

        for(int j = begin; j<end; j++){
            if(arr[j]<pivot){
                i++;

                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        int swapTmp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTmp;

        return i+1;
    }
}
