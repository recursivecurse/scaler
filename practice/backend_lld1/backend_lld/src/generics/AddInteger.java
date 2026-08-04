package generics;

public final class AddInteger<T extends Number> {  // <T extends class & interface1,interface2 ..>

    private T value;
    private AddInteger(T value)
    {
        this.value = value;
    }

    public static <T extends Number> AddInteger<T> getAddInteger(T value)
    {
        return new AddInteger<>(value);
    }

    public  Double add(Double value)
    {
        return (this.value).doubleValue() + value;
    }

    public Integer add(Integer value)
    {
        return this.value.intValue() + value;
    }

    public Float add(Float value)
    {
        return this.value.floatValue() + value;
    }
}
