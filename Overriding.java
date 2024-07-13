class A{
    public void show(){
        System.out.println("in A show");
    }

    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{
    public void show(){ // overiding methods
        System.out.println("In B show");
    }
}

public class Overriding{
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        obj.config();
    }
}
