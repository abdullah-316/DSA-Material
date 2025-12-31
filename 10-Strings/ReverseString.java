public class ReverseString {
    
    public static String reverse(String str) {
      
        // StringBuilder sb = new StringBuilder(str);

        // int start = 0, end = sb.length()-1;
        // while (start < end) {
            
        //     char temp = sb.charAt(start);
        //     sb.setCharAt(start, sb.charAt(end));
        //     sb.setCharAt(end, temp);
        //     start++;
        //     end--;
        // }
        
        // return sb.toString();

        // Another Way
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed = reversed  + str.charAt(i);
        }
        
        return reversed;
    }
    public static void main(String[] args) {
        String str = "TAB";
        System.out.println(reverse(str));
    }
}
