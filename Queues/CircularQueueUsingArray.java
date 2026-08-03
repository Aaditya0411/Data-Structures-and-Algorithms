public class CircularQueueUsingArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // Queue Empty?
        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // Queue Full?
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add (Enqueue)
        public static void add(int data) {

            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            // First Element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove (Dequeue)
        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            // Single Element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // Peek
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Front : " + q.peek());

        System.out.println("Removed : " + q.remove());

        System.out.println("Front : " + q.peek());

        q.add(60);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}