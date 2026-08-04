package lld.solid.prototype;

public class Circle extends Shape{

    private Double radius;

    public Circle(int x, int y, String color, Double radius)
    {
        super(x,y,color);
        this.radius = radius;
    }

    Circle(Circle circle)
    {
        super(circle.x, circle.y, circle.color);
        this.radius = circle.radius;
    }

    @Override
    public Prototype copy() {
        return new Circle(this);
    }

    public Double area()
    {
        return (Math.PI)*(radius*radius);

    }
}
