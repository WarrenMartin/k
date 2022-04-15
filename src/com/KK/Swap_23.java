package com.KK;
import java.util.Arrays;
public class Swap_23 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        swap(arr,1,2);
        System.out.println( Arrays.toString(arr));

    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
