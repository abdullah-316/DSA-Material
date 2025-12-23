public class MoveZerosToEnd {
    
     public static void moveZeros(int nums[]) {
        int n = nums.length;
        int i = 0, j = 0;

        while (j<n) {
            if (nums[j] != 0 ) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] +" ");
        }
    }

    
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,0,12};
        moveZeros(nums);
    }
}
