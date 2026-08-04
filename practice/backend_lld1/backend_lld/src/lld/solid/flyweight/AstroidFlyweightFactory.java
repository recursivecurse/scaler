package lld.solid.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AstroidFlyweightFactory {

    private record Key(Double height, Double width, String color){}
    private Map<Key,AstroidFlyweight> map;

    AstroidFlyweightFactory()
    {
        this.map = new HashMap<>();

    }

    public AstroidFlyweight getAstroidFlyweight(Double height, Double width, String color)
    {
        Key key = new Key(height,width,color);

        return map.computeIfAbsent(key,k-> new AstroidFlyweight(k.height,k.width,k.color));
    }

}
