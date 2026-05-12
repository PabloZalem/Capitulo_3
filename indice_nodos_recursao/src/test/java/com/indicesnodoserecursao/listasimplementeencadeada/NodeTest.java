package com.indicesnodoserecursao.listasimplementeencadeada;

import com.indicesnodoserecursao.listasimplesmenteencadeada.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    Node node;

    @BeforeEach
    public void setUp() {
        node = new Node("A", null);
    }

    @Test
    void shouldCreateNodeWithElements() {
        assertEquals("A", node.getElement());
    } 

    @Test
    void shouldSetElement() {
        node.setElement("B");
        assertEquals("B", node.getElement());
    }

    @Test
    public void shouldSetNextNode() {
        Node nextNode = new Node("C", null);
        node.setNext(nextNode);
        assertEquals(nextNode, node.getNext());
    }
}
