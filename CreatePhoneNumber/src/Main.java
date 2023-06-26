import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        String[] ArrayString = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);

        return "(" +
                ArrayString[0] +
                ArrayString[1] +
                ArrayString[2] +
                ")" +
                " " +
                ArrayString[3] +
                ArrayString[4] +
                ArrayString[5] +
                "-" +
                ArrayString[6] +
                ArrayString[7] +
                ArrayString[8] +
                ArrayString[9];
    }
}