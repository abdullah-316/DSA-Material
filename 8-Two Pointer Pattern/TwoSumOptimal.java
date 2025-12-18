import java.util.Arrays;

public class TwoSumOptimal {

    public static int[] two_sum(int arr[], int n, int target) {
        Arrays.sort(arr);
        int left = 0, right = n-1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            }
            else if (sum > target) {
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,5,8,11};
        int n = 5;
        int target = 16;
        int index[] = two_sum(arr, n, target);

        if (index[0] != -1) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("[" + index[0] + ", " + index[1] + "]");
    }
}
