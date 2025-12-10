public class MaxOfSubArray {
    
    public static void maxSubArray(int num[]) {
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];

                    if (max < sum) {
                        max = sum;
                    }
                }
                System.out.println();
                System.out.println("sum is:" + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum is:" + max);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        maxSubArray(num);
    }
}
