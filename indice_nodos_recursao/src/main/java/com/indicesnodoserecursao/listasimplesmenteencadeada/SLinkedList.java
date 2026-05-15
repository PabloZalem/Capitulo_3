package com.indicesnodoserecursao.listasimplesmenteencadeada;

public class SLinkedList {
    protected Node head;
    protected Node tail;
    protected long size;

    public SLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Inserion First
    public void insertFirst(Node value){
        value.setNext(head);
        head = value;
        size++;
    }

    // Insertion Last
    public void insertionLast(Node value) {
        value.setNext(null);
        tail.setNext(value);
        tail = value;
        size++;
    }

    public void deleteInsertionFirst() {
        if(head == null){
            throw new RuntimeException("Lista Vazia");
        }
        tail = head;
        head = head.getNext();
        tail.setNext(null);
        size--;
    }
}
