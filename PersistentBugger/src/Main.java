import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(persistence(1437));
    }

    public static int persistence(long n) {
        List<String> StringListNumber = new ArrayList<>();
        List<Integer> intListNumber = new ArrayList<Integer>();

        int cont = 0;

        while (n >= 10){
            StringListNumber.clear();
            intListNumber.clear();

            String stringNumber = Long.toString(n);
            StringListNumber.addAll(java.util.Arrays.asList(stringNumber.split("")));

            for (String number : StringListNumber){
                Integer IntNumber = Integer.parseInt(number);
                intListNumber.add(IntNumber);
            }

            n = intListNumber.stream().reduce(1, (a, b) -> a*b);
            cont ++;
        }

        return cont;
    }
}