package Day7;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {10, 20,30,40,50};
        int target = 40;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid]==target) {
                System.out.println("fount at indes " + mid);
                return;
            }
            if(arr[mid]<target){

                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        System.out.println("Not Found");
    }
}
