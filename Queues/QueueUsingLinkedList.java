public class QueueUsingLinkedList {
    static class Node {
        int data ;
        Node next ;
         
        Node(int data){
            this.data =data ;
            this.next = null;
        }
        
    }


    static class Queue {
        
        static Node head = null ;
        static Node tail = null ;


        

        // Queue Empty?
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        
        
        // Add (Enqueue)
        public static void add(int data) {
            Node newnode = new Node(data) ;

            if (head == null) {
                head = tail = newnode;
                return;
            }

            tail.next = newnode ;
            tail = newnode;
        }

        // Remove (Dequeue)
        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

           int front = head.data;
           if (tail == head) {
            tail = head = null;
        }else{
            head = head.next;

        }
        return front;
        }

        // Peek
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

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