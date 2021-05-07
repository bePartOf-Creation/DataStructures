package com.LinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList list;
    Node node;
    @BeforeEach
    void setUp() {
        node = new Node(1);
        list = new LinkedList();
    }
    @AfterEach
    void tearDown() {
    }
@DisplayName("Creating A Node,which should a value")
@Test
    void testCreatingANewNodeWithAValue(){
        node = new Node(1);
        assertEquals(1,node.getValue());
}
@DisplayName("Updating Node with a new value")
@Test
    void testUpdatingNodeWithANewValue(){
        node = new Node(1);
        node.setValue(2);
        assertEquals(2,node.getValue());
    }
@DisplayName("Creating A Node with a reference")
@Test
    void testANodeHasAReference(){
        Node reference = node.getNext();
        assertNull(reference);
    }

@DisplayName("Implementing the addLast() method")
@Test
    void testAddLastMethod(){
        list.addLast(9);
        list.addLast(25);
        list.addLast(8932);
        list.print();
        assertEquals(3, list.getSize());
        assertEquals(8932, list.getLast());
}
@DisplayName("Implementing the addFirst() method")
@Test
    void testAddFirstMethod(){
        list.addLast(22);
        list.addLast(2);
        list.addLast(298);
        list.addFirst(78);
        assertEquals(4,list.getSize());
        assertEquals(78,list.getFirst());
        assertEquals(298,list.getLast());
}
@DisplayName("Implementing an indexOf() method")
@Test
    void testIndexOfMethod(){
        list.addLast(23);
        list.addLast(32);
        list.addLast(34);
        list.print();
        int index = list.indexOf(34);
        assertEquals(0,index);
}

}