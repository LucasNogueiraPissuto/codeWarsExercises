import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth-Warrior"));;
    }

    static String toCamelCase(String s){
        List<String> stringSplited = new ArrayList<>();
        String result = "";

        if (s.isEmpty()){
            return s;
        }

        if (!s.contains("-") && !s.contains("_")){
            Character c = Character.toUpperCase(s.charAt(0));
            result = c+s.substring(1);
            return result;
        }
        if (s.contains("-")) {
            stringSplited.addAll(Arrays.asList(s.split("-")));
        }
        if (s.contains("_")) {
            stringSplited.addAll(Arrays.asList(s.split("_")));
        }


        for (int i = 1; i < stringSplited.size(); i++) {
            String word = stringSplited.get(i);
            Character c = Character.toUpperCase(word.charAt(0));
            stringSplited.set(i, c + word.substring(1));
        }

        for (String word : stringSplited) {
            result += word;
        }
        return result;
    }
}