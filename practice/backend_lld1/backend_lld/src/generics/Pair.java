package generics;

//generic class
public class Pair<T,V>{
    T first;
    V second;

    private Pair(T first,V second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    //generic method
    public static <T,V> Pair<T,V> makePair(T first, V second)
    {
        return new Pair<>(first,second);
    }
}
