package lld.solid.decorator;

public class Main {

    public static void main(String[] args) {

        Character mario = new GunPowerDecorator(new HeightUpDecorator(new MarioBase()));

        System.out.println(mario.getAbilities());

    }
}
