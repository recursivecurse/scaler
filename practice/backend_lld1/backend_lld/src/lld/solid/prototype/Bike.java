package lld.solid.prototype;

import lld.solid.Pigeon;

public class Bike extends Vehicle{

    String name;

    Bike(String type, String name)
    {
        super(type);
        this.name = name;

    }

    Bike(Bike other)
    {
        super(other.type);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
