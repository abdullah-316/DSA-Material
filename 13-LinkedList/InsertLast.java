public class InsertLast {
    
    class Node{
    int data;
    Node next;  

    Node(int d){
        this.data = d;
        this.next = null;
    }
}
    
    public  Node head; 
    public  Node tail; 
    
    public void insertLast(int data){

        Node newNode = new Node(data);
            if (head == null) {
            head = tail = newNode;
            return;
        }

        // Last node Tail is connect the new box
        tail.next = newNode;
        // now tail is shift to the new box
        tail = newNode;
    }

       void add(int newData){
        insertLast(newData);
    }

    public void display(){
        Node current = head;
         while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
       InsertLast list = new InsertLast();
        list.add(10);
        list.add(20);
        list.insertLast(30);
        list.display();
    }
}
