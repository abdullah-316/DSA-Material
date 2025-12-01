public class TwoSum {
    
    public static int[] two_sum(int num[], int target) {
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                
                if (num[i] + num[j] == target ) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 10;
        int index[] = two_sum(nums, target);

        System.out.println("[" + index[0] + ", " + index[1] + "]");
    }


}
