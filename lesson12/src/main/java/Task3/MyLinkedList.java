package Task3;

public class MyLinkedList {

    transient int size = 0;
    transient MyLinkedList.Node<String> first;

    transient MyLinkedList.Node<String> last;

    public int size() {
        return size;
    }

    void linkLast(String e) {
        final MyLinkedList.Node<String> l = last;
        final MyLinkedList.Node<String> newNode = new MyLinkedList.Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    void linkBefore(String e, MyLinkedList.Node<String> succ) {
        final MyLinkedList.Node<String> pred = succ.prev;
        final MyLinkedList.Node<String> newNode = new MyLinkedList.Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }

    String unlink(MyLinkedList.Node<String> x) {
        final String element = x.item;
        final MyLinkedList.Node<String> next = x.next;
        final MyLinkedList.Node<String> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }


    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(index + " index not found!");
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(index + " index not found!");
    }

    public boolean add(String e) {
        linkLast(e);
        return true;

    }

    public void add(int index, String element) {
        checkPositionIndex(index);

        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }

    public String remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    MyLinkedList.Node<String> node(int index) {

        if (index < (size >> 1)) {
            MyLinkedList.Node<String> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            MyLinkedList.Node<String> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private static class Node<String> {
        String item;
        MyLinkedList.Node<String> next;
        MyLinkedList.Node<String> prev;

        Node(MyLinkedList.Node<String> prev, String element, MyLinkedList.Node<String> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
