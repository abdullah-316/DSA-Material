public class BinarySearch {
    
    public static int binary(int numbers[], int key) {
        
        int n = numbers.length;
        int start = 0, end = n-1;

        while (start <= end) {
            
            // Get mid value
            int mid = start + (end - start) / 2;

            if (key == numbers[mid]) {
                return mid;
            }
            else if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 14;

        int index = binary(numbers, key);

        if (index == -1) {
            System.out.println("Key NOT Found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
