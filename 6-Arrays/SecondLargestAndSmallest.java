
public class SecondLargestAndSmallest {
    
    // public static void secondSmallAndLarge(int num[]) {
        
    //     int large = Integer.MIN_VALUE;
    //     int small = Integer.MAX_VALUE;
    //     int first = 0, last = num.length;

    //     for (int i = 0; i < num.length; i++) {
    //         Arrays.sort(num);
    //         if (large < num[last - 2]) {
    //             large = num[last-2];
    //         }
    //         if (small > num[first + 1]) {
    //             small = num[first + 1];
    //         }
    //     }
    //     System.out.println("Second largest Value is:"+large);
    //     System.out.println("Second smallest Value is:"+small);
        
    // }

        public static void secondLargest(int arr[]) {
        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                secondLargest = large;
                large = arr[i];
            }
            if (large > arr[i] && secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        
        int num[] = {1,5,3,9,7};
        secondLargest(num);
        
 
    }
}
