package lld.solid.singleton;

public class Main {

    public static void main(String[] args) {

        //Eager Initialisation
        EagerInitialisation eagerInstance = EagerInitialisation.getInstance();
        EagerInitialisation eagerInstance2 = EagerInitialisation.getInstance();

        System.out.println("EagerInitialisation");


    }
}
