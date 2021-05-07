package com.LinkedList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

}
