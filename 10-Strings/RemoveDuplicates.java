public class RemoveDuplicates {

    public static void characterCheck(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (sb.toString().indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        String str = "abbacda";
        characterCheck(str);
    }
}
