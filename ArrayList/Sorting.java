package ArrayList;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);

        System.out.println(list);

        System.out.println("Sorting in ascending order: ");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Sorting in descending order: ");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
