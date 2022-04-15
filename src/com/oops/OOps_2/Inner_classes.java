package com.oops.OOps_2;

//classes inside a class
public class Inner_classes {
    //here outside classes(NO classes above it) cannot be static bcz it is dependent on any other clss
    class Test{
        String name;

        public  Test(String name){
            this.name=name;
        }
    }

    public void main(String[] args) {
        Test a =new Test("kunal"); //This is bcz this class it self is dependent on outr class
       //this would work if the above class was static or if it was outside the Inner class
       //bcz it is inside inner class  it is dependent on the object of the class

    }
//println is a method
   ///out variable  which is final static variable
    //system is a class
}
