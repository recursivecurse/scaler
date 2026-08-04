package lld.solid;

public class Bird {

    private String type;
    private FlyingBehavior flyingBehavior;
    private SoundBehavior soundBehavior;

    Bird(String type,FlyingBehavior flyingBehavior, SoundBehavior soundBehavior)
    {
        this.type = type;
        this.flyingBehavior = flyingBehavior;
        this.soundBehavior = soundBehavior;
    }

    public void fly()
    {
        flyingBehavior.fly();
    };
    public void makeSound()
    {
        soundBehavior.makeSound();
    };

}
