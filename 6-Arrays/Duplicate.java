public class Duplicate {

    public static int findDuplicate(int arr[]) {
        int n = arr.length;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            int num = arr[i];

            if (check[num]) {
                return num;
            }
            check[num] = true;
        }
        return -1;
    }

    

    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 2, 2 };
        System.out.println(findDuplicate(arr));
    }
}
