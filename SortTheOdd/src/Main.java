import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(sortArray(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));
    }

    public static int[] sortArray(int[] array) {
        ArrayList<Integer> integerNumbers = Arrays.stream(array).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (Integer number : integerNumbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
                integerNumbers.set(integerNumbers.indexOf(number), null);
            }
        }

        for(Integer number : integerNumbers){
            if (number == null){
                integerNumbers.set(integerNumbers.indexOf(number), Collections.min(oddNumbers));
                oddNumbers.remove(Collections.min(oddNumbers));
            }
        }
        array = integerNumbers.stream().mapToInt(i -> i).toArray();

        return array;
    }
}