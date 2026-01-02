public class WordFlipper {
    
    public static String flipper(String sentence) {
        String words[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder("");

        for (int i = words.length-1; i >= 0; i--) {
            String word = words[i];
            StringBuilder revWords = new StringBuilder(word);
            sb.append(revWords.reverse()).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String sentence = "Gaming is Fun";
        System.out.println(flipper(sentence));
    }
}
