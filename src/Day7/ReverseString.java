package Day7;

public class ReverseString {
    static String reverse(String str){
        if(str.length() == 0){
            return "";
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args){
        String str = "Java";
        System.out.println("reverse = " + reverse(str));
    }
}
