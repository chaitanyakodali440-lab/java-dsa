package Day3;

public class Employee {
    String name;
    int age;
    Employee(){ this("abhi",0);}
    Employee(String name){ this ( name,0);}
    Employee(String name, int age){
        this.name =name; this.age = age;
    }

    public static void main(String[] args){
        Employee a = new Employee();
        Employee b = new Employee("Ravi");
        Employee c = new Employee("priya", 21);
        System.out.println(a.name + " " + a.age);
        System.out.println(b.name + " " + b.age);
        System.out.println(c.name + " " + c.age);
    }
}
