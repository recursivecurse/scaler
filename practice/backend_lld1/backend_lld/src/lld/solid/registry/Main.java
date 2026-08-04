package lld.solid.registry;

import lld.solid.prototype.Circle;

public class Main {

    public static void main(String[] args) {

        ShapeRegistry registry = new ShapeRegistry();
        Circle circle = new Circle(1,2,"blue",10.0);
        registry.add("blue_circle",circle);
        Circle circle1 = (Circle)registry.get("blue_circle");
        System.out.println(circle1.area());

    }
}
