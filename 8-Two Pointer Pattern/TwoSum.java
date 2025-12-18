public class TwoSum {

    public static int[] two_sum(int num[], int target) {

        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {

                if (num[i] + num[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] twoSum(int nums[], int target) {
        int n = nums.length;
        int i = 0, j = n - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == target) {
                return new int[] { i, j };
            } else if (sum > target)
                j--;
            else
                i++;
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int index[] = twoSum(nums, target);

        System.out.println("[" + index[0] + ", " + index[1] + "]");
    }

}
