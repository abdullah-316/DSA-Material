public class InterfacesAndImplement {
    
    public static void main(String[] args) {

    //     Queen q = new Queen();
    //     q.moves();

    //     Rook r = new Rook();
    //     r.moves();


    //  Multi-Level interfaces
    // Beer tabo = new Beer();

    // tabo.grass();
    // tabo.meat();

    // Another Example:
    PrintScan ps = new PrintScan();
    ps.print();
    ps.scan();

 
        
    }
}

// interface Chess{
//      void moves(); // method without body
// }

// class Queen implements Chess{
//     public void moves(){
//         System.out.println("Right, Left, Up, Down and Diagonals (4 ways)");
//     }
// }

// class Rook implements Chess{
//     public void moves(){
//         System.out.println("Right, Left, Up, Down");
//     }
// }

/*
  
🔍 Explanation:

* Chess interface ke paas moves() ka declaration hai.
* Queen aur Rook class ne implements keyword se use kiya.
* Dono classes ne method ko override kar diya.

 */

//  Multi-Level interfaces
// interface Ornivore{
//     void grass();
// }
// interface Cornivore{
//     void meat();
// }

// class Beer implements Ornivore, Cornivore{
//     public void grass(){
//         System.out.println("Beer ate Grass");
//     }
//     public void meat(){
//         System.out.println("Beer eats Meat");
//     }

// }

// Example 2:

interface Printable{
    void print();
}

interface Scanable{
    void scan();
}

class PrintScan implements Printable, Scanable{
    public void print(){
        System.out.println("Printing....");
    }

    public void scan(){
        System.out.println("Scaning....");
    }
}

/*
  
  🔍 Explanation:

* Ek class ne do interfaces ko implement kiya.
* Java me multiple class inheritance allowed nahi, lekin multiple interfaces allowed hain.
* Interface ka use yahan modular design ke liye hua.
 
 */