public class RemoveCycleLoop {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;

    public static void removeloop() {

        //Step : 1 initialize pointers

        Node slow = head;
        Node fast = head;
        Boolean CycleFound = false;

        // Step : 2 Detect Cycle

        while (fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next;

            if (slow == fast) {
                CycleFound = true;
                break;
            }
        }

        if (!CycleFound) {
            return ;
        }

        // Step : 3 Find out Cycle Start 

        slow = head ;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step : 4 Last node Null point

        Node temp = slow;
        while (temp.next != slow) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void print(){

        Node curr = head ;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr =curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {


        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.next.next.next.next = head.next;

        removeloop();

        print();
       
    }
}
