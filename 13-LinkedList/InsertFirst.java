public class InsertFirst {

    class Node{
    int data;
    Node next;  

    Node(int d){
        this.data = d;
        this.next = null;
    }
}
    
   public Node head; 
   public Node tail; 
    
    public void insertFirst(int data){
        // 1- I create a new node and assign a value in data form
        Node newNode = new Node(data);
        // If my list is completely empty
         if (head == null) {
            head = tail = newNode;
            return;
        }
        // 2- I connect my new node with head
        newNode.next = head;
        // 3- At last I just make my new node to head
        head = newNode;
    }

       void add(int newData){
        // adding from start 
        insertFirst(newData); 
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
        InsertFirst list = new InsertFirst();
        list.add(20);
        list.add(10);
        list.insertFirst(5);
        list.display();
    }
}
