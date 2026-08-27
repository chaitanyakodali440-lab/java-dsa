package Day6;

public class Palindromecheck {
    public static void main(String[] args){
        String str = " madam ";
        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " it is not a palindrome");
        }
    }
}