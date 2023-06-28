import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("nessa palavra tem " + getCount("ClorOquinAa") + " vogais");
    }

    public static int getCount(String str){
        List<Character> characters = Arrays.asList('a', 'e', 'i', 'o', 'u');
        str = str.toLowerCase();
        int cont = 0;
        for (int i = 0; i < str.length(); i++){
            Character character = str.charAt(i);
            if (characters.contains(character)){
                cont++;
            }
        }

        return cont;
    }
}