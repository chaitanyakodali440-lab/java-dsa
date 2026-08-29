package Day7;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {10,25,7,40,15};
        int target = 40;

        for(int i = 0;i < arr.length;i++){
            if(arr[i] == target){
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
