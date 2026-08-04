package lld.solid.singleton;

public class BillPughSingleton {

    private BillPughSingleton()
    {
        if(SingletonHolder.INSTANCE != null)
            throw new IllegalStateException("Instance already created");
    }

    private static class SingletonHolder
    {
        private static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public BillPughSingleton getInstance()
    {
        return SingletonHolder.INSTANCE;
    }
}
