package lld.solid.decorator;

public class Main {

    public static void main(String[] args) {

        Character mario = new GunPowerDecorator(new HeightUpDecorator(new MarioBase()));

        Character mario2 = new HeightUpDecorator(new GunPowerDecorator(new MarioBase()));
        System.out.println(mario.getAbilities());
        System.out.println(mario2.getAbilities());

    }
}
