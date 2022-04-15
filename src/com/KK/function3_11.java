package com.KK;

import java.util.Arrays;

public class function3_11 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] a) {
        a[0]=9;

    }
}
