import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(encode("(( @"));
    }

    static String encode(String word) {
        Set<Character> repetedChar = new HashSet<>();
        word = word.toLowerCase();
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    repetedChar.add(word.charAt(i));
                }
            }
        }

        for (int i = 0; i < word.length(); i++){
            char character = word.charAt(i);
            if (repetedChar.contains(character)){
                newWord += ')';
            }
            else {
                newWord += '(';
            }
        }

        return newWord;
    }
}