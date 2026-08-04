package lld.solid.singleton;

public class ThreadSafeLazy {

    private static volatile ThreadSafeLazy instance = null;

    private ThreadSafeLazy()
    {

    }

    public static ThreadSafeLazy getInstance()
    {
        if(instance == null)
        {
            synchronized (ThreadSafeLazy.class)
            {
                if(instance == null)                   // Double checking
                    instance = new ThreadSafeLazy();
            }
        }

        return instance;
    }
}
