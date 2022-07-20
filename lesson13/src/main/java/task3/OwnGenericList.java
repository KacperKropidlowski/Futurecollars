package task3;

public class OwnGenericList<E> implements OwnList<E>{

    private E[] elements;

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
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
