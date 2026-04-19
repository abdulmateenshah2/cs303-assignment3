import java.util.ArrayList;

public class RecursiveSearch {

    public static int lastOccurrence(ArrayList<Integer> list, int target, int index) {
        if (index < 0) {
            return -1;
        }

        if (list.get(index) == target) {
            return index;
        }

        return lastOccurrence(list, target, index - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(7);
        numbers.add(1);

        int target = 7;
        int result = lastOccurrence(numbers, target, numbers.size() - 1);

        System.out.println("List: " + numbers);
        System.out.println("Target: " + target);
        System.out.println("Last occurrence index: " + result);
    }
}