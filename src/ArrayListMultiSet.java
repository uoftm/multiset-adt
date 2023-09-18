import java.util.ArrayList;

public class ArrayListMultiSet<T> implements MultiSet<T> {
    private ArrayList<T> list;
    public ArrayListMultiSet() {
        list = new ArrayList<>();
    }
    public void remove(T item) {
        list.remove(item);
    }
    public boolean contains(T item) {
        
    }
}
