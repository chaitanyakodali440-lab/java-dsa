package Day3;

public class StudentData {
    String name;
    int age;

    StudentData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        StudentData d1 = new StudentData("Virat", 40);
        System.out.println("The name of student is " + d1.name);
        System.out.println("The age of student is " + d1.age);


        StudentData d2 = new StudentData("Abhishek", 2);
        System.out.println("the name of Student is "+ d2.name);
        System.out.println("the age of Student is "+ d2.age);

    }
}
