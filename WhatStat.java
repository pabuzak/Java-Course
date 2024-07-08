class Mobile{
    String brand;
    int price;
    static String name; // common varible, objects reference the same variable. there is a differnet area in the JVM that has all the static variables

    static{
        name = "Phone";
    }

    public Mobile(){
        brand = "";
        price = 200;
        // name = "Phone";  this would initiaise it every time an object is created, not that optimal
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name); // you can use a static varialbe in a static method, but cannot use any other variables.
    }
}

public class WhatStat{
    public static void main(String args[]){
        Class.forName("Mobile");    // this will load your class

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; // use class name to refer to static variables.

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        
        obj1.show();
        obj2.show();

        Mobile.show1(obj1); // static method you can call with the class name.
    }
}