// import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {

        // NUMBER EXAMPLES
        // int numbers[] = {10, 20, 30};

        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }

        // STRING EXAMPLES
        // String fruits[] = {"Apple", "Mango", "Melon"};

        // for (int i = 0; i < fruits.length; i++) {
        // System.out.println(fruits[i]);
        // }

        // iNPUT USING ARRAYS
        // int marks[] = new int[50];

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Math marks:");
        // marks[0] = sc.nextInt();
        // System.out.print("Enter Com marks:");
        // marks[1] = sc.nextInt();
        // System.out.print("Enter Eng marks:");
        // marks[2] = sc.nextInt();

        // System.out.println();

        // System.out.println("Math:" + marks[0]);
        // System.out.println("Com:" + marks[1]);
        // System.out.println("Eng:" + marks[2]);

        // sc.close();

        // int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // System.out.println(trapWater(height));
        // int num[] = {4,5,6,7,0,1,2};
        // int target = 2;
        // int index = bs(num, target);

        // if (index == -1) {
        //     System.out.println("Not Found");
        // }
        // else{
        //     System.out.println("Found at: " + index);
        // }

    }




    // UNSORTED ARRAY BINARY SEARCH CODE:
    public static int bs(int num[], int target) {
        
        int n = num.length;
        int left = 0, right = n-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (num[mid] == target) {
                return mid;
            }
            if (num[left] <= num[mid]) {
                
                if (num[left] <= target && target < num[mid]) {
                    right = mid -1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if (num[right] >= target && target < num[mid]) {
                    right = mid -1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    // TRAPPED WATER CODE:
    public static int trapWater(int height[]) {

        int n = height.length;
        

        // MaxLeft
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }


        // MaxRight
        int maxRight[] = new int[n];
        maxRight[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i+1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }

}