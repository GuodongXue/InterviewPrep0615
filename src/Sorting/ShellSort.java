package Sorting;

public class ShellSort {
    public static void shell(int[] arr){
        for(int gap = arr.length/2; gap>0; gap/=2){
            for(int i = gap; i< arr.length; i++){
                for(int j = i-gap; j>=0; j-=gap){
                    if(arr[j]>arr[j+gap]) {
                        int temp = arr[j];
                        arr[j] = arr[gap + j];
                        arr[gap+j] = temp;
                    }
                }
            }
        }
    }
    public static void shell_2(int[] arr){
        for(int gap = arr.length/2; gap>0; gap/=2){
            for(int i = gap; i< arr.length; i++){
                int j = i;
                int temp = arr[j];

                    while (j - gap >= 0 && temp < arr[j-gap]){
                        arr[j] = arr[j- gap];
                        j -= gap;
                        arr[j] = temp;
                    }

            }
        }
    }
}
