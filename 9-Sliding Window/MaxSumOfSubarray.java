public class MaxSumOfSubarray {
    
    public static int maxSubarraySum(int arr[], int k) {
    
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, sum);
        } 

        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        // int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        // int k = 4;
        System.out.println(maxSubarraySum(arr, k));
    }
}
