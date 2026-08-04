package lld.solid.registry;

import lld.solid.prototype.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {

    private final Map<String, Shape> registry = new HashMap<>();

    public void add(String key, Shape shape)
    {
        this.registry.put(key,shape);

    }

    public Shape get(String key)
    {
        Shape shape = registry.get(key);
        if(shape == null)
            throw new IllegalArgumentException("Key not found");


        return (Shape)shape.copy();
    }
}
