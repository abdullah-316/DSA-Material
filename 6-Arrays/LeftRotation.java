public class LeftRotation {
    
    public static void rotate(int arr[], int n) {
        
        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;

        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;
        rotate(arr, n);
    }
}
