public class Pattern10 {
    

    public static void main(String[] args) {
        
        int n = 5;

        // int start = 1;
        // for (int i = 1; i <= n; i++) {
        //    if (i%2 != 0 ) {
        //     start = 1;
        //    } else {
        //     start = 0;
        //    }
        //     for (int j = 1; j <= i; j++) {
        //          System.out.print(start);
        //         start = 1 - start;
        //     }
        //     System.out.println();
        // }

        
        // Alternative
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
