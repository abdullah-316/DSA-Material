public class Pattern5 {
    
    public static void main(String[] args) {
        
        // int num = 3;

        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= num-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Alternate
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
