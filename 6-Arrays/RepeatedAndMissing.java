public class RepeatedAndMissing {
    
    public static int[] check(int arr[], int n ) {
        
        int duplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                }
            }
        }

        int exp_output = n*((n+1))/2;
        int sum = 0;
        int totalFind = 0;
        for (int i = 0; i < n-1; i++) {
            sum += arr[i];
            totalFind = (exp_output-duplicate) - sum;
        }
        return new int[]{duplicate,totalFind};
    }
    public static void main(String[] args) {
        int num[] = {3,1,2,5,3};
        int n = 6;

        int index[] = check(num, n);

        System.out.println("[" + index[0] + ", " + index[1] + "]");

    }
}
