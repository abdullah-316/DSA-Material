public class SumDigit {
    
    public static void sumDigit(int n) {
        
        int num = n;
        int sum = 0;

        while (n>0) {
            int last = n%10;
            sum = sum + last;
            n=n/10;
        }
        System.out.println("Sum of " + num + " = " + sum);
    }
    public static void main(String[] args) {
        sumDigit(1234);
    }
}
