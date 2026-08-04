package lld.solid.singleton;

public class LazyInitialisationThreadUnsafe {

    private static LazyInitialisationThreadUnsafe instance = null;

    private LazyInitialisationThreadUnsafe()
    {

    }

    public static LazyInitialisationThreadUnsafe getInstance()
    {
        if(instance == null)
        {
            instance = new LazyInitialisationThreadUnsafe();
        }

        return instance;
    }

}
