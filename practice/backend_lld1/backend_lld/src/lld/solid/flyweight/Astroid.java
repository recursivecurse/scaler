package lld.solid.flyweight;

public class Astroid {

    private final AstroidFlyweight astroidFlyweight;
    private Double posX;

    public AstroidFlyweight getAstroidFlyweight() {
        return astroidFlyweight;
    }

    public Double getPosX() {
        return posX;
    }

    public Double getPosY() {
        return posY;
    }

    private Double posY;

    public Astroid(AstroidFlyweight astroidFlyweight, Double posX, Double posY) {
        this.astroidFlyweight = astroidFlyweight;
        this.posX = posX;
        this.posY = posY;
    }
}
