public class Main {
    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        queue.offer(70);
        queue.offer(80);
        queue.offer(90);
        queue.offer(100);

        System.out.println("Queue elements:");
        displayQueue(queue);

        queue.move_to_rear();

        System.out.println("\nQueue after move_to_rear:");
        displayQueue(queue);
    }

    public static void displayQueue(MyQueue<Integer> queue) {
        int currentSize = queue.size();

        for (int i = 0; i < currentSize; i++) {
            Integer value = queue.peek();
            System.out.print(value + " ");
            queue.poll();
            queue.offer(value);
        }

        System.out.println();
    }
}