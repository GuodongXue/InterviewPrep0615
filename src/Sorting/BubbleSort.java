package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] nums){
       int temp = 0;
       boolean flag = false;
       for(int i = 0; i<nums.length-1; i++){
           for(int j = 0; j< nums.length-1-i; j++){
               if(nums[j] > nums[j+1]){
                   flag = true;
                   temp = nums[j+1];
                   nums[j+1] = nums[j];
                   nums[j] = temp;
               }
           }
           if(!flag){
               break;
           }else{
               flag = false;
           }
       }
       return nums;
    }

    public static void main(String[] args) {
        /*int[] arr={3, 9, -1, 10, -2};*/
        int[] arr = new int[80];
        for(int i = 0; i<80; i++){
            arr[i]= (int)(Math.random()*100);
        }

        int[] newArr = bubbleSort(arr);
        System.out.println(Arrays.toString(newArr));
    }
}
