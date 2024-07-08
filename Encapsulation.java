class Human{
    private int age; // only acessbile in the same class. No one in the outside world can use it.
    private String name; // every time you make an instance variable, make it private.

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String b){
        name = b;
    }
}

public class Encapsulation{
    public static void main(String args[]){
        Human obj = new Human();

        obj.setAge(30);
        obj.setName("Navin");

        int age = obj.getAge();
        String name = obj.getName();

        System.out.println(age + " : " + name);
    }
}