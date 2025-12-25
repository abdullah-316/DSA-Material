public class MaxSumOfSubarray {
    
    public static int maxSubarraySum(int arr[], int k) {
        // int n = arr.length;
        // int low = 0, high = k-1;
        // int sum = 0;

        // for (int i = low; i <= high; i++) {
        //     sum = sum + arr[i];
        // }

        // int maxSum = 0;
        // while (high < n) {
        //     maxSum = Math.max(maxSum, sum);
        //     low++;
        //     high++;
        //     if (high == n) break;
        //     sum = sum - arr[low-1] + arr[high];
        // }
        // return maxSum;


        // Easy or Alternate way
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
