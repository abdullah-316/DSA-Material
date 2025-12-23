public class RepeatedAndMissing {

    public static int[] check(int arr[], int n) {

        boolean[] check = new boolean[n];
        int duplicate = 0, sum = 0;

        for (int i = 0; i < n - 1; i++) {
            int num = arr[i];

            if (check[num]) {
                duplicate = num;
            }

            check[num] = true;
            sum += num;
        }
        int expectedSum = n * (n + 1) / 2;
        int missing = (expectedSum - sum) - duplicate;

        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        int num[] = { 3, 1, 2, 5, 3 };
        int n = 6;

        int index[] = check(num, n);

        System.out.println("[" + index[0] + ", " + index[1] + "]");

    }
}
