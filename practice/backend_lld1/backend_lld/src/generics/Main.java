package generics;

public class Main {

    public static void main(String[] args) {

        Object obj = "aditya";
        Object obj2 = 10;
        String name="";
        Integer num = 0;
        if(obj instanceof String)
        {
            name = (String) obj;
        }
        if(obj2 instanceof Integer)
        {
            num = (Integer) obj2;
        }
        System.out.println(name);
        System.out.println(num);

        int a= 10;
        double d = 10.0;

        System.out.println((double) a);
        System.out.println((int)d);
        System.out.println((char) a);
        System.out.println(String.format("%.6f",(float)d));

        System.out.println(1+1.0);
        Integer integer  =10;


        Pair p = Pair.makePair(10,"Aditya");
        System.out.println(p.first+" : "+p.second);


        AddInteger<Integer> int1 = AddInteger.getAddInteger(10);
        System.out.println(int1.add(10.0) + " : " + int1.add(10) + " : " + int1.add(10.0f));
    }
}
