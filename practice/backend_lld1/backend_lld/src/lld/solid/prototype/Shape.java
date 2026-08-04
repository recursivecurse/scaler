package lld.solid.prototype;

abstract public class Shape implements Prototype{

    protected int x;
    protected int y;
    protected String color;

    Shape(int x,int y, String color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    Shape(Shape other)
    {
        this.x = other.x;
        this.y = other.y;
        this.color = other.color;
    }

    @Override
    abstract public Prototype copy();

    abstract public Double area();
}
