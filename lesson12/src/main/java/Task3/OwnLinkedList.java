package Task3;

public class OwnLinkedList {

    Node head;

    public static OwnLinkedList add(OwnLinkedList list, String data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static OwnLinkedList addByIndex(OwnLinkedList list, String data, int index) {
        if (index >= size(list)) throw new IllegalArgumentException("Index not found!");

        Node newNode = new Node(data);

        Node current = list.head;
        Node prev = null;

        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.next;
        }

        newNode.next = current;
        if (index == 0) list.head = newNode;
        if (prev != null) prev.next = newNode;

        return list;

    }

    public static OwnLinkedList deleteByIndex(OwnLinkedList list, int index) {
        if (index >= size(list)) throw new IllegalArgumentException("Index not found!");

        Node current = list.head, prev = null;

        if (index == 0 && current != null) {
            list.head = current.next;
            return list;
        }
        int counter = 1;

        while (current != null) {
            if (counter == index) {
                prev.next = current.next;
                break;
            } else {
                prev = current;
                current = current.next;
                counter++;
            }
        }
        return list;
    }

    public static int size(OwnLinkedList list) {
        Node current = list.head, prev = null;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public static void printList(OwnLinkedList list) {
        Node current = list.head;

        System.out.print("\nLinkedList:\n");

        while (current != null) {
            System.out.print(current.data + "\n");

            current = current.next;
        }
        System.out.println("\n");
    }

    private static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

}









