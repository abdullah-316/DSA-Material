public class RemoveDuplicates {
    
    public static void remove(int arr[]) {
        
        int check=0;
        for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i-1]) {
                    check++;
                    arr[check] = arr[i];
                }
        }
        // for printing values
        for (int k = 0; k <= check; k++) {
            System.out.print(arr[k]+" ");
        }
       

    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,3,4,4,5};
        int arr[] = {1,1,1,2,2,3,3,3,4,4};
        remove(arr);
    }
}
