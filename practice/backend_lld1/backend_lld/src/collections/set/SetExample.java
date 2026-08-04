package collections.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        Set<Integer> set = new HashSet<>(10,0.8f);
        Set<Integer> set2 = new LinkedHashSet<>(list);
        //Most used methods same as the ones in <<Collection>>
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.removeAll(List.of(1,2));
        System.out.println(set);

        //TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(Set.of(1,2,3,4));
//        treeSet = Set.copyOf(set2); //Returns immutable set
        treeSet.add(80);
        treeSet.add(90);
        treeSet.add(95);
        treeSet.add(87);
        System.out.println(treeSet);
        System.out.printf("First : %s and Last : %s \n", treeSet.first() , treeSet.last());
        System.out.printf("First : %s and Last : %s \n", treeSet.pollFirst() , treeSet.pollLast());
        System.out.printf("Elements less than %s : %s \n",80,treeSet.headSet(80 ));
        System.out.printf("Elements larger than %s : %s \n",80,treeSet.tailSet(80));
        System.out.printf("Elements from %s to %s : %s \n",3,90,treeSet.subSet(3,90));
        System.out.printf("Largest number smaller than %s: %s \n",90,treeSet.lower(90));
        System.out.printf("Largest number smaller or equal to %s: %s \n",90,treeSet.floor(90));
        System.out.printf("Smallest number greater than %s: %s \n",90,treeSet.higher(90));
        System.out.printf("Smallest number greater or equal to %s: %s \n",90,treeSet.ceiling(90));


    }
}
