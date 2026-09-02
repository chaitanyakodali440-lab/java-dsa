package Day9;
import java.util.PriorityQueue;

public class KthLargestElement {

    static int findKthLargest(int[] arr, int k) {

        // Min Heap
        PriorityQueue<Integer> heap =
                new PriorityQueue<>();

        for (int value : arr) {

            // Add current element
            heap.offer(value);

            // Keep only K elements
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Root is the Kth largest element
        return heap.peek();
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        int k = 3;

        int result = findKthLargest(arr, k);

        System.out.println(
                "Kth Largest Element = " + result
        );
    }
}
