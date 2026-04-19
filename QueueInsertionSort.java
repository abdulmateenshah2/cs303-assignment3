import java.util.LinkedList;
import java.util.Queue;

public class QueueInsertionSort {

    public static void insertionSort(Queue<Integer> numbers) {

        int[] num = new int[numbers.size()];
        int index = 0;

        for (int value : numbers) {
            num[index] = value;
            index++;
        }

        int i, j, key;
        boolean insertionNeeded = false;

        for (j = 1; j < num.length; j++) {
            key = num[j];
            insertionNeeded = false;

            for (i = j - 1; i >= 0; i--) {
                if (key < num[i]) {
                    num[i + 1] = num[i];
                    insertionNeeded = true;
                } else {
                    break;
                }
            }

            if (insertionNeeded) {
                num[i + 1] = key;
            }
        }

        numbers.clear();

        for (int value : num) {
            numbers.offer(value);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.offer(34);
        numbers.offer(8);
        numbers.offer(64);
        numbers.offer(51);
        numbers.offer(32);
        numbers.offer(21);

        System.out.println("Before sorting:");
        System.out.println(numbers);

        insertionSort(numbers);

        System.out.println("After sorting:");
        System.out.println(numbers);
    }
}