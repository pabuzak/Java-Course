class Student{
    int rollno;
    String name;
    int marks;
}



public class ArrayObjects{
    public static void main(String args[]){

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harsh";
        s2.marks = 67;
        
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 97;
        
        Student students[] = new Student[3]; // you do not create 3 student objects, you create an array that can hold 3 student references (doesn't create objects by itself), you have to manually create the objects and assign the objects to the array.

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        // int nums[] = new int[6];

        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 9;
        // nums[3] = 9;

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i])
        // }

    }

}