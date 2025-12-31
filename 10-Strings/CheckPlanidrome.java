public class CheckPlanidrome {
    
    public static Boolean palindrome(String str) {

        // int start = 0, end = n-1;
        //   while (start <= end) {
        //     if (str.charAt(start) != str.charAt(end)) {
        //         return false;
                
        //     }
        //     start++;
        //     end--;
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
