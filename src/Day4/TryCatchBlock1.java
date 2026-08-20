package Day4;
import java.util.Scanner;
public class TryCatchBlock1 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter a Numerator");
            int a=sc.nextInt();
            System.out.println("Enter Denominator:");
            int b=sc.nextInt();
            int result=a/b;
            System.out.println("The result of calculation is"+ result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}