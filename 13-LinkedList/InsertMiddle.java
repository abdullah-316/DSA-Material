
public class InsertMiddle {

    class Node {
        int data;
        Node next; 

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

   Node head;

    // Create a Method to add my box anywhere in middle.
    void insertMiddle(int data, int position) {
        // 1- create a new box
        Node newNode = new Node(data);
        // 2- Walk through from start
        Node current = head;

        // We stop at that spot where we need to insert our box
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        // firstly this box add with their next position eg(20)
        newNode.next = current.next;
        // Now make connectivity with the first one from that spot.
        current.next = newNode;
    }

    void add(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
       InsertMiddle list = new InsertMiddle();
        list.add(10);
        list.add(20);
        list.add(30);
        list.insertMiddle(25, 2);

        list.display();
    }
}
