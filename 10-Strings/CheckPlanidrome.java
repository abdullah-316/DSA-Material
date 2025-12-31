public class CheckPlanidrome {
    
    public static Boolean palindrome(String str) {

        // int left = 0, right = n-1;
        //   while (left <= right) {
        //     if (str.charAt(left) != str.charAt(right)) {
        //         return false;
                
        //     }
        //     left++;
        //     right--;
        // }
        // return true;


        // Alternative
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(palindrome(str));
    }
}
