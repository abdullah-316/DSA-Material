import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        boolean isPrime = true;

        System.out.print("Enter the Number:");
        int num = sc.nextInt();

        for(int i=2; i<=num-1; i++){
            if (num%i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println(num + " is a Prime Number");
        }
        else{
            System.out.println(num + " is NOT a Prime Number");
        }

        sc.close();
    }
    
}
