package LinkedList;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");

        System.out.println(list);

        System.out.println("Size of the LinkedList is " + list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

//        list.removeFirst();
//        System.out.println(list);
//
//        list.removeLast();
//        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.add(3,"list");
        System.out.println(list);
    }
}
