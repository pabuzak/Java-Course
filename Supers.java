class A extends Object{    // super class
            // every class in java extends the object class. this is a class in java, even if its not mentioned.

    // by default, every constructor in Java, has a method, in the first statement this method is super();
    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        this(); // executes the contructor for the same class
        System.out.println("in A int");
    }
}

class B extends A{  // sub class
                    // this is multi level inheritance, so B extends A and A extends Object, B does not extend Object.
    public B(){
        super(5);
        System.out.println("in B");
    }

    public B(int n){
        this();    // super means call the constructor of a super class
        System.out.println("in B int");
    }

}

public class Supers {
    public static void main(String[] args) {
        B obj = new B(5);

    }
}
