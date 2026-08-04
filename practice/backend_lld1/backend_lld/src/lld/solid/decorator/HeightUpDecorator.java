package lld.solid.decorator;

public class HeightUpDecorator extends CharacterDecorator{

    HeightUpDecorator(Character ch)
    {
        super(ch);
    }

    @Override
    public String getAbilities() {
        return super.character.getAbilities() + " with height up";
    }
}
