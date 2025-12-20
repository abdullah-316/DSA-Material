public class ReversedArray {
    
    public static void reversed(int num[]) {
        int n = num.length;
        int start = 0, end = n-1;

        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;

        }
    }

    // Print Array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        reversed(num);
        printArr(num);
    }
}
