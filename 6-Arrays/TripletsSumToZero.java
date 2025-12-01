import java.util.*;

public class TripletsSumToZero {

    public static List<int[]> tripletsZero(int arr[], int target) {

        // for this question we need to use Array List
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[left] + arr[right] + arr[i];

                if (sum == target) {
                    result.add(new int[] { arr[i], arr[left], arr[right] });
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1])
                        left++;

                    while (left < right && arr[right] == arr[right + 1])
                        right--;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        if (result.isEmpty()) {
            result.add(new int[] { -1, -1, -1 });
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 0, 1, -1, 4 };
        int target = 0;

        List<int[]> index = tripletsZero(arr, target);

        for (int[] pair : index) {
            // System.out.println("[" + pair[0] + ", " + pair[1] + ", " + pair[2] + "]");
            System.out.println(Arrays.toString(pair));
        }
    }
}
