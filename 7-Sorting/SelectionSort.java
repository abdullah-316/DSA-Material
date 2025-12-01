public class SelectionSort {

    public static void selection(int arr[]) {
        int n = arr.length;

        int swap = 0;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {

                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            swap++;
        }
        System.out.println("swap:" + swap);

        // for printing the values
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };
        int arr[] = { 0, 2, 2, 1, 0, 1 };
        selection(arr);
    }
}
