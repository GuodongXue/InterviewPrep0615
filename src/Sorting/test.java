package Sorting;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

      int[] arr = new int[8000];
        for(int i = 0; i<8000; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        //System.out.println(Arrays.toString(arr));
/*
        int[] newArr = SelectionSort.selection(arr);
*/
      /*  InsertionSort.insertSort(arr);*/
/*        ShellSort.shell_2(arr);*/
        /*int[] arrTest = {5, 9, 4, 6, 5, 8};*/
        int[] arrTest = {4, 5,8, 1, 6, 5};
        quickSort.quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}
