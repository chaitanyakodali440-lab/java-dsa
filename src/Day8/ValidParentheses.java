package Day8;

import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (ch == ')' && top != '(')
                    return false;

                if (ch == '}' && top != '{')
                    return false;

                if (ch == ']' && top != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "(){}[]";
        String test2 = "([{}])";
        String test3 = "(]";
        String test4 = "([)]";

        System.out.println(test1 + " -> " + isValid(test1));
        System.out.println(test2 + " -> " + isValid(test2));
        System.out.println(test3 + " -> " + isValid(test3));
        System.out.println(test4 + " -> " + isValid(test4));
    }
}
