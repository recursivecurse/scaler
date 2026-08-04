package lld.solid;

public class Main {

    public static void main(String[] args) {

        QuirkSound quirkSound = new QuirkSound();
        FlyingBirds flyingBirds = new FlyingBirds();
        Pigeon pigeon = new Pigeon("Dove","Pigeon",flyingBirds,quirkSound);

        pigeon.fly();
        pigeon.makeSound();

    }
}
