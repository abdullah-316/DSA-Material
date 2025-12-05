public class Pattern11 {
    
    public static void hollow(int rows, int col) {
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                
                if (i == 1 || j == 1 || i == rows || j == col) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow(4, 5);
    }
}
