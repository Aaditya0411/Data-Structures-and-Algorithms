public class StartingQueue {

    static class Queue {

        static int arr[];
        static int front = -1;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            rear = -1;

        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == arr.length - 1;
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                return;
            } else if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }

            int ans = arr[front];

            if (front == rear) {
                front = rear = -1;
            } else {
                front++;

            }

            return ans;

        }

        // peek

        public static int peek() {
            if (isEmpty()) {
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

        System.out.println(q.peek()); 

        System.out.println(q.remove()); 

        System.out.println(q.peek()); 

        q.add(40);
        q.add(50);
        q.add(60); 
    }
}
