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

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}

/* 
    Algoritmo addFirst(v):
        v.setNext(head); -> O novo nó "v" vai apontar para o antigo primeiro nó da lista
        head = v; -> O novo primeiro elemento da lista é "v"
        size = size + 1;
    
    Algoritmo addLast(v):
        v.setNext(null); -> Prepara o ultimo nó
        tail.setNext(v); -> Conecta no final
        tail = v; -> atualiza o fim da lista
        size = size + 1;
    
    Algoritmo removeFirst():
        se(size = 0):
            lanca excecao(lista vazia);
        
        tail = head; -> 
        head = head.getNext();
        tail.setNext(null);
        size = size - 1;
*/