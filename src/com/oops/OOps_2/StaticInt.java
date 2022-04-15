package com.oops.OOps_2;


//Demo to show initliaisation of static variables
public class StaticInt {
    static int a=4;
    static int b;

    ///static block will get executed exaclty once when the class is first loaded first time
    static {
    System.out.println("IM in static block");
    b=a*5;
//static block wiilll only run once when the first obj is created i.e when the class is loaded
}

    public static void main(String[] args) {
        StaticInt obj=new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);
        StaticInt.b+=3;

        StaticInt obj2=new StaticInt();


    }


}
