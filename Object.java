class Calculator{
    // heap memory will store this, it is an instance variable
    int num = 5;

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public double add(double num1, int num2){
        return num1 + num2;
    }
}

public class Object{
    public static void main(String args[]){

        // not an object, it's a reference variable, creates a new object in the heap memory
        Calculator obj = new Calculator();


        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}