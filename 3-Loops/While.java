import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int val = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i<=val) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is: " + sum);

        sc.close();
    }
}
