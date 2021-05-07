package com.LinkedList;

import lombok.Getter;

@Getter

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public int getFirst() {
        return first.getValue();
    }
    public int getLast() {
        return last.getValue();
    }
    public void addLast(int item) {
        var node =  new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.setNext(node);
            last = node;
        }
        size++;
    }
    public void print(){
        for(int i = 0; i < getSize();i++){
            System.out.println(i);
        }
    }
    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            first.setNext(node);
            first = node;
        }
        size++;
    }
    public int indexOf(int item) {
        int index = 0;
        var currentNode = first;
        currentNode.setValue(item);
        while (isNotEmpty()){
            if (currentNode.getValue() == item)
                return index;
            currentNode = currentNode.getNext();
            index++;
        }
        return indexNotFound();
    }
   private boolean isNotEmpty(){
        return first != null;
   }
   private boolean isEmpty(){
        return first == null;
    }
   private  int indexNotFound(){
        return -1;
    }

}
