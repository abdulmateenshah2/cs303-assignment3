public class MyQueue<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int count;

    public MyQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public void offer(T value) {
        Node newNode = new Node(value);

        if (empty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        count++;
    }

    public T poll() {
        if (empty()) {
            return null;
        }

        T removedValue = front.data;
        front = front.next;
        count--;

        if (front == null) {
            rear = null;
        }

        return removedValue;
    }

    public T peek() {
        if (empty()) {
            return null;
        }

        return front.data;
    }

    public int size() {
        return count;
    }

    public boolean empty() {
        return count == 0;
    }

    public void move_to_rear() {
        if (size() <= 1) {
            return;
        }

        T firstValue = peek();
        poll();
        offer(firstValue);
    }
}