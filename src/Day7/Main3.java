package Day7;

public class Main3 {
    public static void main(String[] args) {
        int[] num = {5, 3, 8, 1, 2};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[i] > num[j + 1]) {
                    int temp = num[i];
                    num[i] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted ");
        for (int numb : num) {
            System.out.print(numb + "");
        }
    }
}