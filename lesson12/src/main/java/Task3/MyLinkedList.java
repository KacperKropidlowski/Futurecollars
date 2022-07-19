package Task3;

public class MyLinkedList {

    int size = 0;
    Node<String> first;

    Node<String> last;

    public int size() {
        return size;
    }

    private void linkLast(String entry) {
        final Node<String> last1 = last;
        final Node<String> newNode = new Node<>(last1, entry, null);
        last = newNode;
        if (last1 == null) {
            first = newNode;
        } else {
            last1.next = newNode;
        }
        size++;
    }

    private void linkBefore(String entry, Node<String> succ) {
        final Node<String> pred = succ.prev;
        final Node<String> newNode = new Node<>(pred, entry, succ);
        succ.prev = newNode;
        if (pred == null) {
            first = newNode;
        } else {
            pred.next = newNode;
        }
        size++;
    }

    private String unlink(Node<String> stringNode) {
        final String element = stringNode.item;
        final Node<String> next = stringNode.next;
        final Node<String> prev = stringNode.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            stringNode.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            stringNode.next = null;
        }

        stringNode.item = null;
        size--;
        return element;
    }

    private boolean isPositionIndexExisting(int index) {
        return index >= 0 && index <= size;
    }

    private boolean isElementIndexExisting(int index) {
        return index >= 0 && index < size;
    }


    private void checkPositionIndex(int index) {
        if (!isPositionIndexExisting(index)) {
            throw new IndexOutOfBoundsException(index + " index not found!");
        }
    }

    private void checkElementIndex(int index) {
        if (!isElementIndexExisting(index)) {
            throw new IndexOutOfBoundsException(index + " index not found!");
        }
    }

    public boolean add(String element) {
        linkLast(element);
        return true;

    }

    public void add(int index, String element) {
        checkPositionIndex(index);

        if (index == size) {
            linkLast(element);
        } else {
            linkBefore(element, node(index));
        }
    }

    public String remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    private Node<String> node(int index) {

        if (index < (size >> 1)) {
            Node<String> stringNode = first;
            for (int i = 0; i < index; i++) {
                stringNode = stringNode.next;
            }
            return stringNode;
        } else {
            Node<String> stringNode = last;
            for (int i = size - 1; i > index; i--) {
                stringNode = stringNode.prev;
            }
            return stringNode;
        }
    }

    protected static class Node<String> {
        String item;
        Node<String> next;
        Node<String> prev;

        Node(Node<String> prev, String element, Node<String> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
