package lld.solid.prototype;

abstract public class Vehicle {

    protected String type;

    Vehicle(String type)
    {
        this.type = type;
    }

    abstract public void move();
}
