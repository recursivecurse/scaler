package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);


        Iterator<Integer> iterator = integerList.iterator();
        ListIterator<Integer> iteratorBack = integerList.listIterator(integerList.size());
        while(iterator.hasNext())
            System.out.println(iterator.next());


        while(iteratorBack.hasPrevious())
            System.out.println(iteratorBack.previous());


        collections.ArrayList list = new collections.ArrayList(4);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.capacity());
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            Iterator<Integer> itr2 = list.iterator();
            while(itr2.hasNext()) System.out.printf(itr2.next()+" ");
            System.out.println(itr.next());
        }
    }
}
