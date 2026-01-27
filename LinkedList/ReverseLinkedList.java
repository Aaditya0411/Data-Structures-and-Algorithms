

public class ReverseLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // Step :-1 Create a newNode

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step:-2 newNode next = head
        newNode.next = head; // linking

        // Step:- 3 Head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newnNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnNode;
            return;
        }

        tail.next = newnNode;
        tail = newnNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {

            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
            
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast(){
          if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
          }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;
          }

          //prev : i = size-2
        Node prev = head ;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev ;
        size--;
        return val;

    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void reverse(){
        Node prev = null;   
        Node  curr = tail= head ;
        Node next ;

        while (curr != null) {
            next = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        head = prev ;

    }

  

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(20);
        ll.addLast(30);
    
        ll.add(2, 100);

        ll.print();
        
        ll.reverse();
        ll.print();    
        

        
        
    }
}
