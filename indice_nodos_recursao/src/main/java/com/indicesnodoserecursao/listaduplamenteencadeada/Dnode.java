package com.indicesnodoserecursao.listaduplamenteencadeada;

public class Dnode {
    protected String element;
    protected Dnode next, previous;

    public Dnode(String element, Dnode next, Dnode previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Dnode getNext() {
        return next;
    }

    public void setNext(Dnode next) {
        this.next = next;
    }

    public Dnode getPrevious() {
        return previous;
    }

    public void setPrevious(Dnode previous) {
        this.previous = previous;
    }

}
