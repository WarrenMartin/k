package com.oops.OOps_2;

public class main {
    public static void main(String[] args) {
        Human kunal=new Human(19,"Kunal",100000,false);
        Human Rahul=new Human(34,"Rahul",1000,false);//f the below statement was not there then population count would be 2
        Human Rahl=new Human(34,"Rahul",1000,false);
        //what if there is a property which is common amoung human being
        //maybe population which is common to all
        //The characteristic of human poplulation is same for all the humans
        //They are Not lpgically related to object such property is known as static Variable
        System.out.println(kunal.population);//this is a bad practice you should always call it by class as population is not a part of object
        System.out.println(Human.population); //this is a correct way because Human template has population

//static can be accessed without the object
//public static void main---main is declared as static method bcz u can use main method without creating object of that class
//In short static is not dependent on objects
//you cannot access non static stuf without referencing their instance in



    }
    static void fun(){
        greeting();

        main obj=new main(); ///making a object with name obj which is from class main
        obj.greeting();
        //basically if it is not static then you require a object to run
        //static method cn called only by static and not by  non static.
    }

    static void greeting() {
        System.out.println("Greeting is called in fun function if greeting wasnt static it would have given a error");
    }
}
//note that this keyword cnnot be used in a class which is static beacuse this is actually a object and static is independent on a object
