package lld.solid;

public class NoFly implements FlyingBehavior{

    @Override
    public void fly() {
        System.out.println("I do not fly");
    }
}
