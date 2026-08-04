package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.removeFirstOccurrence(10);
        list.addAll(1,List.of(3,2,3,4));
        System.out.println(list);
        System.out.println(list.indexOf(3)+" " +list.lastIndexOf(3));

        List<Integer> arrayList = List.copyOf(list);

        ArrayList<Integer> arrayList1 = new ArrayList<>(arrayList);



    }
}
