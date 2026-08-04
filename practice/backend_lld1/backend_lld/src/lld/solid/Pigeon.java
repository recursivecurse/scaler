package lld.solid;

public class Pigeon extends Bird{

    private String name;

    Pigeon(String name,String type,FlyingBehavior flyingBehavior, SoundBehavior soundBehavior)
    {
        super(type,flyingBehavior,soundBehavior);
        this.name = name;

    }


}
