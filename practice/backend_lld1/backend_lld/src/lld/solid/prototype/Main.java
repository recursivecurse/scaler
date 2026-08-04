package lld.solid.prototype;

public class Main {

    public static Vehicle copy(Vehicle vehicle)
    {
        //Violates OCP and SRP
        Vehicle copy = null;
        if(vehicle instanceof Bike)
        {
            copy = new Bike((Bike)vehicle);
        }
        if(vehicle instanceof Car)
        {
            copy = new Car((Car)vehicle);
        }

        return copy;
    }

    public static void main(String[] args) {

        //Problem with copy constructor
        Bike bike = new Bike("Bike","Honda");

        Bike bikecopy = (Bike)copy(bike);
        bikecopy.move();

        //Basic Prototype
        Circle circle = new Circle(23,56,"blue",2.2);

        Circle circle1 = (Circle) circle.copy();
        System.out.println(circle1.area());
    }
}
