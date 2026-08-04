package collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList implements Iterable<Integer> {

    private Integer[] arr ;
    private int size = 0;
    private int capacity;

    ArrayList()
    {
        this.capacity = 10;
        this.arr = new Integer[capacity];
    }
    ArrayList(int capacity)
    {
        this.capacity = capacity;
        this.arr = new Integer[capacity];
    }

    public void resize()
    {
        capacity *= 2;
        Integer[] temp= new Integer[capacity];
        for(int i=0;i<size;i++)
        {
            temp[i] = arr[i];
        }
        this.arr = temp;

    }
    public int size()
    {
        return this.size;
    }
    public int capacity()
    {
        return this.capacity;
    }
    public void add(Integer value)
    {
        if(value != null && size<capacity)
        {
            arr[size++] = value;
        }
        else if(size==capacity)
        {
            resize();
            arr[size++] = value;
        }

    }

    public Integer get(int idx)
    {
        return this.arr[idx];
    }

    @Override
    public String toString() {

        StringBuilder s= new StringBuilder();
        for(int i=0;i<size;i++)
        {
            s.append(arr[i]);
            s.append(" : ");
        }

        return s.toString();

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Integer pos = 0;

            @Override
            public boolean hasNext() {
                return pos < size;
            }

            @Override
            public Integer next() {
                return arr[pos++];
            }
        };
    }



}
