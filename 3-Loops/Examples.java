// import java.util.Scanner;

public class Examples {
    
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Number: ");
        // int n = sc.nextInt();

        // // Reverse of a number.
        // int count = 0;

        // while (n>0) {
            
        //     count = n % 10;
        //     n = n/10;
        //     System.out.print(count);
            
        // }
       
        

        // int rev = 0;
        
        // while (n>0) {
        //     int count = n%10;
        //     rev = (rev * 10) + count;
        //     n=n/10;
        // }
        // System.out.println("Reverse: " + rev);


        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i*i;
            
        }
        System.out.println(sum);

        
    }
}
