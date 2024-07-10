class Human{
    private int age; // only acessbile in the same class. No one in the outside world can use it.
    private String name; // every time you make an instance variable, make it private.

    // constructor looks like a method itself.
    // its use as a 'default value' for the variables.
    public Human(){ // default constructor
        age = 12;
        name = "John";
    }

    public Human(int a, String n){  // Parameterized contructor
        age = a;
        name = n;
    }

    public Human(String n){  // Parameterized contructor
        this.age = 12;
        name = n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // this means it indicates it is an instance variable, representing the current object

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // public int getAge(){
    //     return age;
    // }

    // public void setAge(int a){
    //     age = a;
    // }

    // public String getName(){
    //     return name;
    // }

    // public void setName(String b){
    //     name = b;
    // }
}

public class Encapsulation{
    public static void main(String args[]){
        Human obj = new Human();
        Human obj1 = new Human(18, "Navin");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

        // obj.setAge(30);
        // obj.setName("Navin");

        // int age = obj.getAge();
        // String name = obj.getName();

        // System.out.println(age + " : " + name);
        // System.out.println(obj1.getName() + " : " + obj.getAge());
    }
}