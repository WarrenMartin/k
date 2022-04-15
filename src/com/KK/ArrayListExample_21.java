package com.KK;

import java.util.ArrayList;

public class ArrayListExample_21 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10); //you can not add premitive you have to add wrapper classes
        list.add(46);
        list.add(44);//the inital capaity is 10 you can add how many you want
        System.out.println(list);

    }
}
