import java.util.Scanner;

public class Temperature {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("You had a Fever");
            
        } else {
            System.out.println("You're Alright");
        }
        sc.close();
    }
}
