package lld.solid.prototype;

public class Car extends Vehicle{

    private String name;

    Car(String type, String name)
    {
        super(type);
        this.name = name;
    }

    Car(Car other)
    {
        super(other.type);
        this.name = other.name;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
