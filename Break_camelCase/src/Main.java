import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(camelCase("CoisaNossa"));
    }

    public static String camelCase(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++){
            char character = input.charAt(i);

            if(Character.isUpperCase(character)){
                result += " ";
            }

            result += input.charAt(i);
        }
        return result;
    }

}