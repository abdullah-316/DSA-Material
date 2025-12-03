import java.util.Scanner;

public class Loops{

    public static void main(String[] args) {
        
        // for (int i= 1; i <= 10; i++) {
        //     System.out.println(i);
        // }

        // Tables
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
        sc.close();
    }
}