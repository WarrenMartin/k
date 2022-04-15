package com.oops.OOps_2;


public class Human {
    //you cannot build this beacuase it has no main function

        int age;
        String name;
        int salary;
        boolean married;
       static long population;    //This property not related to object but r common to all object of class are declared as static



        public Human(int age,String name,int salary,boolean married){  //created a constructor
            this.age=age;
            this.name=name;
            this.salary=salary;
            this.married=married;
            //Human.population++1; //class name wil give you same ans as this
            this.population+=1; //This will print 2 as here the population is 2(2 objects are there)
//if file is same folder you dont have to import

        }


}
