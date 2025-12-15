public class KadanesAlgo {

    public static void kadanes(int num[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < num.length; i++) {
            currSum += num[i];
            if (currSum < 0) {
                currSum = 0;
            }

            if (num[i] < 0) {
                maxSum = Math.max(num[i], maxSum);
            } else {
                maxSum = Math.max(maxSum, currSum);
            }
            // if (maxSum < currSum) {
            // maxSum = currSum;
            // }
        }
        System.out.println("Max Sum is:" + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { -2, -3, 4, 1, -2, -1, 5, -3 };
        // int num[] = {-4,-2,-3,-1};
        kadanes(num);
    }
}
