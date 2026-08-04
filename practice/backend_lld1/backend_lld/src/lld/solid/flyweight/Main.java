package lld.solid.flyweight;

public class Main {
    public static void main(String[] args) {

        AstroidFlyweightFactory aff = new AstroidFlyweightFactory();

        AstroidFlyweight af = aff.getAstroidFlyweight(10.0,12.0,"blue");

        Astroid a = new Astroid(af,5.4,6.3);
        System.out.println(a.getPosX()+" "+a.getPosY()+" "+a.getAstroidFlyweight().height());
    }
}
