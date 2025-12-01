public class VowelsCheck {
    
    public static void vowels(String str) {
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int check = str.charAt(i);
            if (check == 'a' || 
            check == 'e' ||
            check == 'i' ||
            check == 'o' ||
            check == 'u' ) {
                count++;
            }
        }
        System.out.println("Vowels Count:" + count);
    }
    public static void main(String[] args) {
        String str = "Amberiou";
        vowels(str.toLowerCase());
    }
}
