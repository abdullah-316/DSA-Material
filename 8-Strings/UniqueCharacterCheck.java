public class UniqueCharacterCheck {

    public static void unique(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.print(ch);
            }
        }

    }

    public static void main(String[] args) {
        String str = "abbacda";
        unique(str);
    }
}
