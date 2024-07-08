public class WhatS{
    public static void main(String args[]){
        String name = "navin";
        name = name + " reddy"; // this creates a new object, with the new string

        System.out.println("hello " + name);

        String s1 = "Navin"; 
        String s2 = "Navin";
        // in total here, we only get 1 object, as the value of the address will be the same
        // there is a special area in the Heap, called string constant pool.
        // Every string you use, is actually a constant. You can't change the data.



    }

}