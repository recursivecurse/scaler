package collections.set;

public class Node<T,V>{
    private T key;
    private V value;

    public Node(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
