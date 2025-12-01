public class MinOfSubArray {
    
    public static void minSubArray(int num[]) {
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];

                    if (min > sum) {
                        min = sum;
                    }
                }
                System.out.println();
                System.out.println("sum is:" + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum is:" + min);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        minSubArray(num);
    }
}
