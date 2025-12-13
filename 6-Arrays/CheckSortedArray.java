public class CheckSortedArray {
    
    public static Boolean checkArraySorted(int arr[], int n) {
        
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        int arr[] = {1,2,4,3,5};
        int n = 5;
        System.out.println(checkArraySorted(arr,n));
    }
}
