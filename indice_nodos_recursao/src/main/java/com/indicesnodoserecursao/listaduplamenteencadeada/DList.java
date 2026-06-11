package com.indicesnodoserecursao.listaduplamenteencadeada;

public class DList {
    protected int size;
    protected Dnode header, trailer;

    // construtor da lista duplamente encadeada esta vazia
    public DList(){
        this.header = new Dnode(null, null, null); // nó sentinela do início da lista
        this.trailer = new Dnode(null, this.header, null); // nó sentinela do final da lista
        this.header.setNext(this.trailer); // o próximo do header é o trailer e o anterior do trailer é o header
        this.size = 0;
    }

    // Retorna o número de elementos na lista
    public int size(){
        return this.size;
    }

    // Informa se a lista está vazia
    public boolean isEmpty(){
        return this.size == 0;
    }

    // Retorna o primeiro elemento da lista
    public Dnode first(){
        if (isEmpty()) throw new RuntimeException("Lista vazia"); // se a lista estiver vazia, lança uma exceção
        return this.header.getNext(); // retorna o nó do próximo do header
    }

    // Retorna o último elemento da lista
    public Dnode last(){
        if (isEmpty()) throw new RuntimeException("Lista vazia"); // se a lista estiver vazia, lança uma exceção
        return this.trailer.getPrevious(); // retorna o nó do anterior do trailer
    }

    // Retorna o no que antecede um dado no v. Gera erro se v é o cabecalho
    public Dnode getPrevious(Dnode v){
        if (v == this.header) throw new RuntimeException("O nó é o cabeçalho, não tem anterior"); // se o nó for o header, lança uma exceção
        return v.getPrevious(); // retorna o nó do anterior de v
    }

    // Retorna o no que sucede um dado no v. Gera erro se v é o trailer
    public Dnode getNext(Dnode v){
        if (v == this.trailer) throw new RuntimeException("O nó é o trailer, não tem próximo"); // se o nó for o trailer, lança uma exceção
        return v.getNext(); // retorna o nó do próximo de v
    }


}

/*
    Algoritmo removeLast():
        se size = 0 então
            lançar exceção "Lista vazia"
        v <- trailer.getPrevious() // obtém o ultimo nó da lista, que é o nó anterior ao trailer
        u <- v.getPrevious() // obtém o nó anterior a v
        trailer.setPrevious(u) // o trailer agora aponta para u como seu nó anterior
        u.setNext(trailer) // u agora aponta para o trailer como seu próximo
        v.setPrevious(null) // desvincula v do seu nó anterior
        v.setNext(null) // desvincula v do seu nó próximo
        size <- size - 1 // decrementa o tamanho da lista
*/