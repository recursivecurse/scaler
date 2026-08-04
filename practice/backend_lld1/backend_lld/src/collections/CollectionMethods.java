package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionMethods {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(1);
        list.add(100);
        list.addAll(List.of(45,46,27,42));

        System.out.println(list);
        list.remove(Integer.valueOf(10)); //Do not pass primitive int it will be treated as index
        list.removeAll(List.of(1,45));

        System.out.println(list);

        Integer[] arr = list.toArray(new Integer[0]);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(10);
        set.add(4);

        Integer[] arr1 = set.toArray(new Integer[0]);




    }
}
