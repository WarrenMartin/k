package com.oops.OOps_1;

public class Wrapper_class_oops_1 {
    public  static void main(String[] args) {
        int a=10; //not a object
        Integer num1=new Integer(45);// a object of type interger
        //a.  ::: this wont give aditional features
        //but num1. will give a lot more additional features


        //using final keyword
        //speciality of final keyword is that it cannot be modified
        // the final keyword variable name should always be capital
        final int INCREASE=2;
        //INCREASE=5; this wil give an error
        //make sure you always initialise the final keyword  it while declaring it
        Warren ab=new Warren(10,"are",97.6f);
        System.out.println(ab.b);



        //when a non-primitve is final you cannot reassign it
       // kk=new A("new object"); //this wont work




    }


   static class Warren{
        int a=10;
        String b;
        float p=90.0f;
        //Make sure that constructor doesnt have any return type for ex void,int etc.
        Warren(int a,String b,float p){ //make sure the constructor is the same name as that of class
            this.a=a;
            this.b=b;
            this.p=p;

        }

       @Override
       protected void finalize() throws Throwable {
           System.out.println("Object gone tata");
       }
   }

   class A{
        final int num=10;
        String name;

        public A(String name){
            this.name=name;

        }
   }



}
