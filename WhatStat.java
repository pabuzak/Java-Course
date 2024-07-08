class Mobile{
    String brand;
    int price;
    static String name; // common varible, objects reference the same variable. there is a differnet area in the JVM that has all the static variables

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class WhatStat{
    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; // use class name to refer to static variables.

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        
        obj1.show();
        obj2.show();
    }
}