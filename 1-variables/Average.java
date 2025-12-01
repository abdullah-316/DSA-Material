import java.util.Scanner;

public class Average{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first Number:");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number:");
        int n2 = sc.nextInt();
        System.out.print("Enter third Number:");
        int n3 = sc.nextInt();

        int avg = (n1+n2+n3) / 3;
        
        System.out.println("Average is " + avg);



    }
}