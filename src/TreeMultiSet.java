public class TreeMultiSet<T> implements MultiSet<T> {
    private final Tree<T> tree;

    public TreeMultiSet() {
        tree = new Tree<T>(null, null);
    }

    public boolean add(T item) {
        return tree.add(item);
    }

    public void remove(T item) {
        tree.deleteItem(item);
    }

    public boolean contains(T item) {
        return tree.contains(item);
    }

    public boolean isEmpty() {
        return tree.isEmpty();
    }

    public int count(T item) {
        return tree.count(item);
    }

    public int size() {
        return tree.size();
    }
}
