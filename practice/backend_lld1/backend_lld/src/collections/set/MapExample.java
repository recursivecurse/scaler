//package collections.set;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class MapExample<T,V> {
//
//    private List<List<Node<T,V>>> map;
//    private final Integer SIZE =10;
//    public MapExample()
//    {
//        map = new ArrayList<>(SIZE);
//    }
//
//    public boolean add(T key, V value)
//    {
//        int hash = key.hashCode();
//         return map.get(hash%SIZE).add(new Node<>(key,value));
//    }
//
//    public V get(T key)
//    {
//        int hash = key.hashCode();
//        List<Node<T,V>> list = map.get(hash%SIZE);
//        for(Node<T,V> node : list)
//        {
////            if(node.get)
//        }
//    }
//}
