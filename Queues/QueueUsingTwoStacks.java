import java.util.*;

public class QueueUsingTwoStacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

          public static boolean isEmpty(){
            return s1.isEmpty();
          }

          //add
          public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
                
            }
          }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }

            return s1.pop();
        }

        //peek 
        public static int peek(){
             if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }

            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue <Integer> q = new Queue<>();

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
