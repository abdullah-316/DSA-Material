import java.util.Scanner;

public class Condition{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value: ");
        int val = sc.nextInt();

        if (val > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        sc.close();
    }
}