public class BubbleSort {

    public static void bubble(int arr[], int n) {

        for (int i = 0; i < n-1; i++) {
            int swap = 0;
            for (int j = 0; j < n - 1 ; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
                
            }
            System.out.println("swaps:" + swap);
        }

        
        // for printing the values
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        bubble(arr, n);
    }
}