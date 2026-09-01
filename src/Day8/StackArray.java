package Day8;

public class StackArray {
    static int[] stack = new int[5];
    static int top = -1;
    static void push(int value){
        if(top == stack.length - 1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }
    static int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    static int peek(){
        if(top == -1) {
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top];
    }
    public static void main(String[] args){
        push(10);
        push(20);
        push(30);

        System.out.println("Top: " + peek());

        System.out.println("Pop: " + pop());
        System.out.println("Pop: " + pop());
    }
}