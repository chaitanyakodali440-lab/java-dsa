package Day7;

public class fibonacci {
    static int Fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n - 2);
    }
    public static void main(String[] args){
        int n = 6;
        System.out.println("fibonacci = " + Fibonacci(n));
    }
}
