public class Binomial {


    public static int binomial(int n, int r) {
        
        // Function Callbacks
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        return n_fact / (r_fact * nmr_fact);
    }
    
    public static int factorial(int n) {
        
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {
        
        System.out.println(binomial(6, 4));
    }
}
