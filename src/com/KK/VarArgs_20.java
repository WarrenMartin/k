package com.KK;

import java.util.Arrays;

public class VarArgs_20 {
    public static void main(String[] args) {

        fun(1,2,3,3,4,5,5,33,333,3,3);
    }
    static void fun(int ...a){


        System.out.println(Arrays.toString(a));
    }
    static void m(int a,String ...v){
        //System.out.println(Array);

    }
}
