package lld.solid.decorator;

public class GunPowerDecorator extends CharacterDecorator{

    GunPowerDecorator(Character ch)
    {
        super(ch);
    }

    @Override
    public String getAbilities() {
        return super.character.getAbilities() + " with gun power";
    }
}
