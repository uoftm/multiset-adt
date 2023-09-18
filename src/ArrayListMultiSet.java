import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMultiSet<T> implements MultiSet<T> {
    private final ArrayList<T> list;

    public ArrayListMultiSet() {
        list = new ArrayList<>();
    }

    public boolean add(T item) {
        list.add(item);
        return true;
    }

    public void remove(T item) {
        list.remove(item);
    }

    public boolean contains(T item) {
        return list.contains(item);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int count(T item) {
        return Collections.frequency(list, item);
    }

    public int size() {
        return list.size();
    }
}
