package lld.solid;

public class ChirpSound implements SoundBehavior{

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
