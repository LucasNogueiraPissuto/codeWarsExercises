import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        towerBuilder(500);
    }

    public static String[] towerBuilder(int nFloors) {

        List<String> tower = new ArrayList<String>();

        if (nFloors > 0) {

            String towerFloor = "*".repeat((nFloors * 2) - 1);
            String newToweFloor = towerFloor;

            for (int i = 0; i < nFloors; i++) {
                newToweFloor = towerFloor + " ".repeat(i);
                towerFloor = towerFloor.replaceFirst("\\*\\*", " ");
                tower.add(0, newToweFloor);
            }

            for (String floor : tower){
                System.out.println(floor);
            }
            return tower.toArray(new String[tower.size()]);
        }
        else {
            return new String[]{""};
        }
    }
}