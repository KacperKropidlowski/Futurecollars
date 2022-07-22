package task3;

public class OwnGenericList<E> implements OwnList<E> {

    private Object[] elements = new Object[10];

    @Override
    public boolean add(E e) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = e;
                return true;
            }
        }
        Object[] temp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        temp[elements.length] = e;
        elements = temp;
        return true;
    }

    @Override
    public E get(int index) {
        return (E) this.elements[index];
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                elements[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.elements.length;
    }
}
