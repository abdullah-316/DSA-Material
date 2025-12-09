public class LargestNumber {
    
    public static int largest(int nums[]) {
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > large) {
                large = nums[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 6, 3, 5, 7, 1};

        int value = largest(nums);
        System.out.println("Largest Number is: "+ value);
    }
}
