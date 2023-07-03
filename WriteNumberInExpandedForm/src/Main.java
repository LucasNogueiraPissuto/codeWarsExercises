import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(expandedForm(70304));
    }

    public static String expandedForm(int num)
    {
        String strInt = Integer.toString(num);
        List<String> digits = new ArrayList<>(Arrays.asList(strInt.split("")));
        String result = "";

        int cont = 1;

        for (int i = digits.size() - 1; i >= 0 ; i--) {
            Integer intNumber = Integer.parseInt(digits.get(i)) * cont;
            digits.set(i, Integer.toString(intNumber));
            cont *= 10;
        }

        digits.removeAll(Collections.singleton("0"));

        for(String digit : digits){
            result += digit + " + ";

        }

        if (result.length() > 2) {
            result = result.substring(0, result.length() - 3);
        }

        return result;
    }

}