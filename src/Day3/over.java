package Day3;

class  Animal3{
    void sound()
    {
        System.out.println("Animal Sounds");
    };
}

class Dog extends Animal3
{
    @Override
    void sound()
    {
        System.out.println("Animal barks");
    }
}

public class over {
    public static void main(String[] args)
    {
Dog d=new Dog();
d.sound();
Animal3 a=new Animal3();
a.sound();
    }
}
