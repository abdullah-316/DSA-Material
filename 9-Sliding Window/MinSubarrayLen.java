public class MinSubarrayLen {

    public static int minLenSubarray(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        while (high < n) {
            sum = sum + arr[high];
            while (sum >= target) {
                int len = high - low + 1;
                minLen = Math.min(minLen, len);
                sum = sum - arr[low];
                low++;
            }
            high++;
        }
        if (minLen == Integer.MAX_VALUE)
            return 0;
        else
            return minLen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 4 };
        int target = 4;
        // int arr[] = {1,1,1,1,1,1,1,1};
        // int target = 11;
        System.out.println(minLenSubarray(arr, target));
    }
}
