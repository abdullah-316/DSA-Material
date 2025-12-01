

public class MoveAllZeros {
    
    public static void zero(int arr[]) {
        
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                System.out.print(arr[pos]+" ");
                pos++;
            }    
        }
        for (int i = pos; i < arr.length; i++) {
            arr[pos] = 0;
            System.out.print(arr[pos]+ " ");
        }
        
    }
    public static void main(String[] args) {
        // int arr[] = {1,0,2,3,0,4,0,1};
        int arr[] = {1,2,0,1,0,4,0};
        zero(arr);
    }
}
