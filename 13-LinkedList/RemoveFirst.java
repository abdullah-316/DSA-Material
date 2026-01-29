public class RemoveFirst {
    
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

      public int removeFirst(){

        // Corner cases
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = head.next;
            size = 0;
            return val;
        }

        // first I get the value which is store in head
        int val = head.data;
        // Then I point to the next head.
        // eg: if my head is 10, then now after that operation my new head is 20
        head = head.next;
        size--; // my size also decrease because I just remove my fist val
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
        RemoveFirst list = new RemoveFirst();
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(30);
        // list.display();
        list.removeFirst();
        list.display();
        System.out.println(list.size);
    }
}
