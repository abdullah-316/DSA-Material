import java.util.Arrays;

public class TripletSumClosest {
    
    public static int threeSumClosest(int nums[], int target) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        int maxDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n-2; i++) {
            
            int left = i+1;
            int right = n-1;

            while (left < right) {
                
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if(maxDiff > diff){
                    maxDiff = diff;
                    result = sum;
                }

                if (sum == target) {
                    left++;
                    right--;
                }
                else if (sum < target) {
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
