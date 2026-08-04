package lld.solid.prototype;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    Rectangle(int x, int y, String color, Double width, Double height)
    {
        super(x,y,color);
        this.width = width;
        this.height = height;
    }

    Rectangle(Rectangle rectangle)
    {
        super(rectangle.x,rectangle.y,rectangle.color);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Prototype copy() {
        return new Rectangle(this);
    }

    @Override
    public Double area() {
        return width*height;
    }
}
