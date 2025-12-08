public class Plaindrome {
    
    public static Boolean reverse(int n) {
        
        int num = n;
        int rev = 0;

        while (num!=0) {
            int last = num%10;
            rev = (rev * 10) + last;
            num=num/10;
        }
        
        if (n == rev) {
            return true;
        }
        return false;
    }

    // public static Boolean plaindrome(int n) {
        
    //     for (int i = 0; i <= n; i++) {
    //         if (n == reverse(i)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public static void main(String[] args) {
       System.out.println(reverse(12321));
    }
}
