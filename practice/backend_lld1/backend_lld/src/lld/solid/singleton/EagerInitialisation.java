package lld.solid.singleton;

public class EagerInitialisation {

    private static EagerInitialisation instance = new EagerInitialisation();

    private EagerInitialisation()
    {

    }

    public static EagerInitialisation getInstance()
    {
        return instance;
    }
}
