public class PairsArray {
    
    public static void pairs(int num[]) {
        
        // int n = num.length;
        int tp = 0;
        for (int i = 0; i < num.length; i++) {

            for (int j = i+1; j < num.length; j++) {
              
                System.out.print("(" + num[i] + ", " + num[j] + ") ");
                // tp = n*(n-1) /2; // Arithematic progression to calculate the sum of n
                tp++;
            }
            
            System.out.println();
        }
        System.out.println("Total pairs:" + tp);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        pairs(num);
    }
}
