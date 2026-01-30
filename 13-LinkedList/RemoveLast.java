public class RemoveLast {
    
      class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

     Node head;
     Node tail;
     int size;

      public int removeLast(){

        // Corner cases
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // create a pointer which start from head.
        Node current = head;
// Traverse them from head to my size-2 to check the second last value before tail.
        for (int i = 0; i < size-2; i++) {
            current = current.next;
        }
        // now I get my second last value data.
        int val = current.next.data;
        // point to the null bcz I want to remove my last value.
        current.next = null;
        // Second last value is now become the tail.
        tail = current;
        size--;
        return val;
    }

    void add(int newData) {
        Node newNode = new Node(newData);
        size++; // check the size of the list
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
        RemoveLast list = new RemoveLast();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        list.removeLast();
        list.display();
        System.out.println(list.size);
    }
}
