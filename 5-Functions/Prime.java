public class Prime {
    
// Optimised Way
    public static Boolean prime(int n) {
        boolean isPrime = true;

        // Math.sqrt is the Inbuit function that is used as the square root of the Number 
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n%i == 0) {
                isPrime = false;
            }
        }

        // if (isPrime == true) {
        //     System.out.println(n +" is a Prime number");
        // }
        // else{
        //     System.out.println(n +" is NOT a Prime number");
        // }

        return isPrime;
    }

    public static void primeRange(int n) {
        
        for(int i=2; i<=n; i++){
            // Function Call
            if (prime(i)) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        primeRange(20);

    }
}
