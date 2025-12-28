public class StringBuilderExample {
    
    public static void main(String[] args) {
        
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        //     sb.append(ch);
        // }
        // System.out.println(sb.length());

        StringBuilder sb = new StringBuilder("ambitious");
        int count=0;
        for (int i = 0; i < sb.length(); i++) {
            int vowel = sb.charAt(i);
            if (vowel == 'a' ||
                vowel == 'e' ||
                vowel == 'i' ||
                vowel == 'o' ||
                vowel == 'u' ) {  
                    count++;
            }
        }
        System.out.println(count);
    }
}
