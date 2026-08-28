package Day7;

public class RecursiveMax {
    static int findMax(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        int max = findMax(arr, index + 1);

        if(arr[index] > max){
            return arr[index];
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr =  {10,25,7,40,15};
        System.out.println("maximum = " + findMax(arr,0));
    }
}
