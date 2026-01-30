public class SearchKey {
    
    public class Node {
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
        
    }

    Node head;
    Node tail;

    void add(int newData){
        Node newNode = new Node(newData);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    int search(int key){
        Node current = head;
        int i = 0;

        while (current != null) {
            if (current.data == key) {
                return i;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SearchKey list = new SearchKey();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        System.out.println(list.search(4));
    }
}

