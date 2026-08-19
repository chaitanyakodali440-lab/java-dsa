package Day3;

public class Animal {
    void eat()
    {
        System.out.println("Dog eats ");
    }
    static class Dog extends Animal
    {
        void bark()
        {
            System.out.println("Dog Barks ");
        }
    }

    public static void main(String[] args){
        Dog d=new Dog(); d.eat(); d.bark();
    }
}