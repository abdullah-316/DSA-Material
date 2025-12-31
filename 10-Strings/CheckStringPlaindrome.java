public class CheckStringPlaindrome {

    public static Boolean stringPlaindrome(String str) {
        int n = str.length();
        int left = 0, right = n - 1;

        String strLower = str.toLowerCase();
        while (left < right) {
            
                Boolean checkLeft = Character.isLetterOrDigit(strLower.charAt(left));
                Boolean checkRight = Character.isLetterOrDigit(strLower.charAt(right));
                

                if (!checkLeft) {
                    left++;
                    continue;
                } 
                if (!checkRight) {
                    right--;
                    continue;
                }

             if (strLower.charAt(left) != strLower.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(stringPlaindrome(str));
    }
}
