package com.dataStructuresImpl;

public class MyStack {
    private int[] elements;
    private int lastLocationWritten = -1;

    public MyStack(int numberOfElements) {
        elements = new int[numberOfElements];
    }

    public void push(int elementToPush) {
        if(isFull()){
            throw new StackOverflowException("Stack is Full");
        }
        elements[++lastLocationWritten] = elementToPush;
    }

    public int peek() {
        if(isEmpty()){
            throw new StackUnderflowException("Stack is Empty");
        }
        return elements[lastLocationWritten];
    }

    public int pop() {
        if(isEmpty()){
            throw new StackUnderflowException("Stack is Empty");
        }
        int lastElement = elements[lastLocationWritten];
        elements[lastLocationWritten] = 0;
        lastLocationWritten--;
        return lastElement;
    }

    public boolean isEmpty() {
        return (lastLocationWritten == -1);
    }

    public boolean isFull() {
        return(lastLocationWritten == (elements.length - 1));
    }

    public static class StackOverflowException extends RuntimeException {
        public StackOverflowException(String message) {
            super(message);
        }
    }

    public static class StackUnderflowException extends RuntimeException {
        public StackUnderflowException(String message) {
            super(message);
        }
    }
}
