public class Examples {

    // public static void hello() {
    //     System.out.println("Hello Bhai!");
    //     System.out.println("Hello Bhai!");
    // }


    public static int prod(int n1, int n2) {
        return n1*n2;
    }

    public static void swap(int a, int b) {
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    

    public static void main(String[] args) {
        // int cal = prod(5, 6);
        // System.out.println(cal);

    //    swap(5, 10);


    }
}