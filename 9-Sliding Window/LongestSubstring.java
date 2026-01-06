public class LongestSubstring {
    
    public static int longestSubstringMax(String str) {
        int left = 0, maxLen = 0;
        boolean[] isSeen = new boolean[256];

        for (int right = 0; right < str.length(); right++) {
            Character checked = str.charAt(right);

            while (isSeen[checked]) {
                Character leftRM = str.charAt(left);
               isSeen[leftRM] = false;
               left++;
            }
            isSeen[checked] = true;
            int len = right-left+1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(longestSubstringMax(str));
    }
}
