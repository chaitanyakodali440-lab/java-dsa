package Day1;

public class Findmax {
    public static void main(String[] args){
        int a = 25;
        int b = 50;
        int c = 40;

        int maximum = a;
        if(b>maximum){
            maximum = b;
        }
        if(c> maximum){
            maximum = c;
        }
        System.out.println("the maximum of all " + maximum);
    }
}
