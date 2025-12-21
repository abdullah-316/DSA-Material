

public class SortedAndSquare {
    
    public static int[] squareAndSort(int arr[]) {
        
        int n = arr.length;
        int i = 0, j = n-1;
         int newArr[] = new int[n]; // create new array to store the values
        int pos = n-1; // to identify the position to store the value

        while (i<=j) {
            // Sqaure of all elements
            int s1 = arr[i]*arr[i];
            int s2 = arr[j]*arr[j];

            if (s1 > s2) {
                newArr[pos] = s1;
                i++;
            }
            else{
                newArr[pos] = s2;
                j--;
            }
            pos--;
        }
        return newArr;
    }

    // Print array function
    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {-4,-2,-1,0,3,5};
        int square[] = squareAndSort(arr);
        printArr(square); 
        
    }
}
