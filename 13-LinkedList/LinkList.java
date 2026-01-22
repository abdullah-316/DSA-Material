
public class LinkList {
    // Step 1: Create the "Box" (The Node)
    class Node {
        int data;
        Node next; // The "Link" (the address of the next box)

        // Constructor: When we create a new box, we put data in it
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // This is the only thing we MUST remember (the start)
     Node head;
     int size;

    // A method to add a new "box" to the end of the list
    void add(int newData) {
        Node newNode = new Node(newData);
        size++; // check the size of the list
        // If the list is empty, this new box IS the head
        if (head == null) {
            head = newNode;
            return;
        }

        // If not empty, we walk from the head until we find the end
        Node current = head;
        while (current.next != null) {
            current = current.next;// Move to the next box
        }
        // We found the end! Attach the new box here
        current.next = newNode;
    }

    // A method to print all items
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        System.out.println(list.size);
    }
}
