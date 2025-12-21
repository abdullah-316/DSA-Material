public class MergeAndSorted {

    public static int[] mergeSorted(int arr1[], int arr2[]) {
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;
        int newArr[] = new int[n + m];
        int count = 0;
        while (i < n || j < m) {

            // Corner case to check if my i value is equal to the length
            if (i == n) {
                newArr[count] = arr2[j];
                count++;
                j++;

            // Corner case to check if my j value is equal to the length
            } else if (j == m) {
                newArr[count] = arr2[i];
                count++;
                i++;

            } else if (arr1[i] <= arr2[j]) {
                newArr[count] = arr1[i];
                count++;
                i++;

            } else {
                newArr[count] = arr2[j];
                count++;
                j++;

            }

        }
        return newArr;

    }

    // function for printing values
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5 };
        int arr2[] = { 2, 4, 6 };
        
        int merged[]= mergeSorted(arr1, arr2);
        printArr(merged);
    }
}
