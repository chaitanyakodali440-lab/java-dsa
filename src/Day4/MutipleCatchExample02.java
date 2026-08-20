package Day4;

public class MutipleCatchExample02 {
    public static void main(String[]args)
    {
        try{
            int[] numbers={10,20,30};
            int a= Integer.parseInt( "100");
            int b=0;
            System.out.println("The Division by"+a/b);
            System.out.println("Print the number array"+numbers[5]);
        }catch(ArithmeticException e) {
            System.out.println("The Artimetic Exception" + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound"+e.getMessage());
        }catch(NumberFormatException e)
        {
            System.out.println("Arthmetic exception"+e.getMessage());
        }
        {
            System.out.println("Program executes successfully");
        }
    }
}