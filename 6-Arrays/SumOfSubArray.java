public class SumOfSubArray {
    
    public static void subArraySum(int num[]) {
        
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];
                }
                System.out.println();
                System.out.println("sum is:" + sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        subArraySum(num);
    }
}
