package lld.solid.decorator;

abstract public class CharacterDecorator implements Character{

    protected Character character;

    CharacterDecorator(Character character)
    {
        this.character = character;
    }


    abstract public String getAbilities();


}
