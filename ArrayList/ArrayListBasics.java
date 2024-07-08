package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(0);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(1);
        System.out.println(list);

        // get element
        int element = list.get(2);
        System.out.println(element);

        // add element at specific position
        list.add(1, 9);
        System.out.println(list);

        // set element
        list.set(0, 10);
        System.out.println(list);

        //delete element
        list.remove(1);
        System.out.println(list);

        // size of list
        int size = list.size();
        System.out.println(size);

        // loop on list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
