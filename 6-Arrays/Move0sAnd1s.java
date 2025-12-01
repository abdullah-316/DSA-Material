public class Move0sAnd1s {

    public static void segregate0sAnd1s(int arr[]) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low < high) {
            if (arr[low] == 0) {
                low++;
            } else if (arr[high] == 1) {
                high++;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // int pos = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // arr[pos] = 0;
        // pos++;
        // }
        // }

        // for (int i = pos; i < arr.length; i++) {
        // arr[i] = 1;
        // }

        // for (int x : arr) {
        // System.out.print(x+" ");
        // }
    }

    public static void main(String[] args) {
        int num[] = { 0, 0, 1, 1, 0 };
        segregate0sAnd1s(num);
    }
}
