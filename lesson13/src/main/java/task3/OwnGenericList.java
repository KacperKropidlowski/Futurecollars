package task3;

public class OwnGenericList<E> implements OwnList<E>{

    private final Object[] elements = new Object[10];

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public E get(int index) {
        return (E) this.elements[index];
    }

    @Override
    public boolean remove(E o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
