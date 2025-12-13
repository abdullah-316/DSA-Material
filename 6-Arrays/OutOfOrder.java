

public class OutOfOrder {
    
    public static void out(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                count++;
                 System.out.println(i +" are out of order");
            }
            
        }
        
        System.out.println(count + " elements are out of order");
        
        
    }
    public static void main(String[] args) {
        // int arr[] = {1,3,2,5,4};
        int arr[] = {5, 2, 3, 1, 4};
        out(arr);
        
    }
}
