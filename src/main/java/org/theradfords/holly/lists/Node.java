package org.theradfords.holly.lists;

public class Node {
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private String data;
    private Node next = null;


}
