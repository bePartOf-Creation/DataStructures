package com.dataStructuresImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    MyStack  myStack;
    @BeforeEach
    void startWithThis(){
        myStack = new MyStack(5);
    }

    @Test
    void pushOneElementTest(){
        myStack = new MyStack(5);
        myStack.push(5);
        assertEquals(5,myStack.peek());
    }
    @Test
    void pushTwoElementTest(){
        myStack.push(8);
        myStack.push(6);
        assertEquals(6,myStack.peek());//To peek means To Observe the element in the stack
    }
    @Test
    void pushTwoElement_popOneTest(){
        myStack.push(4);
        myStack.push(11);
        assertEquals(11,myStack.pop());//To pop means To remove the last in element(11) in the stack
        assertEquals(4,myStack.peek());
    }
    @Test
    void pushTwo_PopTwo_shouldBeEmpty(){
        myStack.push(4);
        myStack.push(11);
        myStack.pop();
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }
    @Test
    void pushThree_shouldBeFullTest(){
        myStack = new MyStack(3);
        myStack.push(4);
        myStack.push(11);
        myStack.push(1);

        assertTrue(myStack.isFull());
    }
    @Test
    void pushOneElement_afterStackIsFull_ThrowStackOverflowException(){
        myStack = new MyStack(3);
        myStack.push(4);
        myStack.push(11);
        myStack.push(1);
        assertTrue(myStack.isFull());
        assertThrows(MyStack.StackOverflowException.class, ()-> myStack.push(5));
    }
    @Test
    void remLastElement_whenStackIsEmpty(){
        assertTrue(myStack.isEmpty());
        assertThrows(MyStack.StackUnderflowException.class, ()-> myStack.pop());
    }
    @Test
    void peekEmptyStack_throwsStackUnderflowException(){
        assertTrue(myStack.isEmpty());
        assertThrows(MyStack.StackUnderflowException.class, ()-> myStack.peek());
    }
}
