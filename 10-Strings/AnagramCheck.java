import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] str1Char = str1.toCharArray();
            char[] str2Char = str2.toCharArray();

            Arrays.sort(str1Char);
            Arrays.sort(str2Char);

            Boolean result = Arrays.equals(str1Char, str2Char);

            if (result) {
            System.out.println(str1 + " and " + str2 + " are Anagrams");
            }
            else{
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams");
            }
        }
        else{
        System.out.println(str1 + " and " + str2 + " are NOT Anagrams");
        }
    }
}
