public class MultipleDuplicates {
    
   public static void moreDuplicates(int arr[]) {
        int n = arr.length;
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            int check = arr[i];
            count[check]++;
            if (count[check] > 1) {
                System.out.print(check + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 4, 1, 1, 2, 2 };
        moreDuplicates(arr);
    }
}
