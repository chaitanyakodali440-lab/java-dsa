package Day7;

public class Main4 {
    public static void main(String[] args){
        int[] numbers = {5,3,8,1,2};
        for(int i = 0;i < numbers.length - 1;i++){
            for(int j = 0; j < numbers.length  - 1-i;j++){
                if(numbers[i] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[i] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
