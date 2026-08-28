package Day6;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("are anagrams:" + areAnagrams(str1, str2));
    }
    public static boolean areAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap <Character,Integer> frequency = new HashMap<>();
        for(int i = 0; i < str1.length();i++){
            char ch = str1.charAt(i);
            frequency.put(ch,frequency.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < str2.length();i++){
            char c = str2.charAt(i);
            if(frequency.containsKey(c)){
                return true;
            }
            frequency.put(c,frequency.get(c) - 1);
            if(frequency.get(c)==0){
                frequency.remove(c);
            }
        }
        return frequency.isEmpty();
    }

}
