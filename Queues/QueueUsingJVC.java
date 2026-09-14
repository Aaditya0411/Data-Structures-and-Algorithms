import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJVC {
    public static void main(String[] args) {

        // Queue q = new Queue();


        Queue <Integer> q = new LinkedList<>();

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
