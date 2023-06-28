public class Main {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
    }

    public static String getMiddle(String word) {
        int position = Math.floorDiv(word.length(),2);

        if (word.length() % 2 != 0){
            Character c = word.charAt(position);
            return c.toString();
        }
        else {
            char a = word.charAt(position - 1);
            char b = word.charAt(position);
            return String.valueOf(a) + String.valueOf(b);
        }
    }
}

