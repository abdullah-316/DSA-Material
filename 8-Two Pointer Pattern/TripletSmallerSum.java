public class TripletSmallerSum {
    
    public static int smallerTriplet(int nums[], int target) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n-2; i++) {
            
            int left = i+1;
            int right = n-1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum >= target) {
                    right--;
                }
                else{
                    ans = ans + (right-left);
                    left++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int nums[] = {-2,0,1,3};
        int nums[] = {5, -1, 3, -4, 7};
        int target = 6;
        System.out.println(smallerTriplet(nums, target));
    }
}
