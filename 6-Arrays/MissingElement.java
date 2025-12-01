public class MissingElement {
    
    public static void missing(int arr[], int n) {
        
        int n_sum = n*(n+1)/2;
        int mis_num = 0;
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum = sum + arr[i];
            mis_num = n_sum - sum;
        }
            System.out.println(mis_num);
        }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        // int arr[] = {1,3};
        int n = 3;

        missing(arr, n);
    }
}
