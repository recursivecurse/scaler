package streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IntermediaryExample {

    public static void main(String[] args)
    {
        System.out.println("Hi");

        List<Integer> list = new ArrayList(List.of(1,2,3,4,5,6,7,8,9));
        

        list.stream()
            .filter(x -> x % 2 ==0)
            .map(x -> x*x)
            .forEach(System.out::println);

        Integer sum = list.stream()
                        .reduce(0,(a,b) -> a+b);
        
        System.out.println(sum);
                        

        
        record Order(List<String> items){}

        List<String> listItems = List.of("Desktops","Laptops","TV","Fridge");

        Order order = new Order(listItems);

        List<Order> orders = List.of(
            new Order(List.of("Fridge","Induction")),
            new Order(List.of("Television","Sofa","Dining Table")),
            new Order(List.of("Clock","Table"))
        );

        orders.stream()
              .flatMap(x -> x.items().stream())
              .map(String::toUpperCase)
              .forEach(System.out::println);

        Map<Integer,String> mp = listItems.stream()
                .collect(Collectors.toMap(
                    x -> x.length(),
                    x->x
                    
                ));

        Map<Integer,List<String>> map2 = listItems.stream()
                                                .collect(
                                                    Collectors.groupingBy(
                                                        x -> x.length(),
                                                        Collectors.mapping(String::toLowerCase, Collectors.toList())
                                                    )
                                                );

        System.out.println(map2);

        Map<Integer,String> map3 = mp.entrySet().stream()                                                
                                                .filter(x -> x.getValue().length() > 2)
                                                
                                                .collect(Collectors.toMap(
                                                    x -> x.getKey(),
                                                    Map.Entry::getValue
                                                ));

        System.out.println(map3);
    }

}
