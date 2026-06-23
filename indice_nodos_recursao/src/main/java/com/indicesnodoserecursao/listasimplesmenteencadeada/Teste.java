package com.indicesnodoserecursao.listasimplesmenteencadeada;

public class Teste {
    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();

        Node n1 = new Node("A", null);
        Node n2 = new Node("B", null);
        Node n3 = new Node("C", null);

        list.insertHead(n3);
        list.insertHead(n2);
        list.insertHead(n1);

        Node current = list.getHead();

        while (current != null) {
            System.out.print(current.getElement());

            current = current.getNext();
        }
    }
}