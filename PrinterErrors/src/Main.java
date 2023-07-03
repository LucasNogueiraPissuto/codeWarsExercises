import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
    }

    public static String printerError(String s) {
        int wrongLetter = 0;
        List<Character> possibleLetters = Arrays.asList('a',
                'b',
                'c',
                'd',
                'e',
                'f',
                'g',
                'h',
                'i',
                'j',
                'k',
                'l',
                'm');

        for (int i = 0; i < s.length(); i++){
            if (!possibleLetters.contains(s.charAt(i))){
                wrongLetter++;
            }
        }

        return wrongLetter + "/" + s.length();
    }
}
