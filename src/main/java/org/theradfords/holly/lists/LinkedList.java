package org.theradfords.holly.lists;

public class LinkedList implements List {
    private Node front = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public void append(String entry) {
        size++;
        Node newNode = new Node();
        newNode.setData(entry);
        if (front == null) {
            front = newNode;
            front.setNext(null);
        } else {
            Node ptr = front;
            while (ptr.next() != null) {
                ptr = ptr.next();
            }
            ptr.setNext(newNode);
        }
    }

    public String get(int position) {
        int count = 0;
        Node ptr = front;
        if (this.size() <= position) {
            return null;
        }

        while (count < position) {
            ptr = ptr.next();
            count++;
        }
        return ptr.getData();
    }
}
