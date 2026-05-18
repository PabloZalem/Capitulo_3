package com.indicesnodoserecursao.listasimplesmenteencadeada;

public class SLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Insertion Head element
    public void insertHead(Node value) {
        value.setNext(head);
        head = value;
        size++;
    }

    // Insertion Tail element
    public void insertTail(Node value){
        value.setNext(null);
        tail.setNext(value);
        tail = value;
        size++;
    }

    // Delete element
    public void delete(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        tail = head;
        head = head.getNext();
        tail.setNext(null);
        size--;
    }
}
