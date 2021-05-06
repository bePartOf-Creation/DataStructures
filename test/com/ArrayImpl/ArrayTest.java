package com.ArrayImpl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    Array testArray;

    @BeforeEach
    void setUp() {
        testArray = new Array();
    }
    @AfterEach
    void tearDown() {
    }
@DisplayName("An Array Has an Item or Items")
@Test
    void testThatArrayHasAnItem(){
        int[] items = {1,2,3};
        testArray.setItem(items);
        assertEquals(3,items.length);
}
@DisplayName("Elements in An Array Can be Gotten")
@Test
    void testThatItemInAnArrayCanBeGotten(){
        int[] items = {1,2,3};
        testArray.setItem(items);
        assertEquals(3,testArray.getItems().length);
}
@DisplayName("An Array's Constructor has a Fixed-assigned Length")
@Test
    void testThatArrayConstructorHasAFixed_Assigned_Length(){
        int[] items = {1,2,3};
        testArray = new Array(items.length);
        assertEquals(3,testArray.getItems().length);
}
@DisplayName("An Array Has an Iterating count")
@Test
    void testThatArrayHasACounterForItsItemsCount(){
        int[] newItems = {1,2,3};
        int count = newItems.length - 1;
        testArray.setCount(count);
        assertEquals(2,testArray.getCount());
    }
@DisplayName("Implementing The insert() method")
@Test
    void insertMethodTest(){
        assertEquals(0, testArray.getCount());
        testArray.setCount(3);
        int[] newArr = {1, 2, 3};
        testArray.setItem(newArr);
        assertEquals(3,testArray.getCount());
        testArray.insert(4);
        testArray.insert(5);
        assertEquals(5,testArray.getCount());
    }
@DisplayName("Implementing The removeAt() method")
@Test
    void removeAtMethodTest(){
        testArray.setCount(3);
        int[] newArray = {1,2,3};
        testArray.setItem(newArray);
        assertEquals(3,testArray.getItems().length);
        assertEquals(3,testArray.getCount());
        testArray.removeAt(0);
        assertEquals(2,testArray.getCount());
}
@DisplayName("Implementing the indexOf() method")
@Test
    void indexOfTestMethod(){
        testArray.setCount(3);
        int[] newArray = {1,2,3};
        testArray.setItem(newArray);
        assertEquals(3,testArray.getItems().length);
        assertEquals(3,testArray.getCount());

        int index = testArray.indexOf(2);
        int index2 = testArray.indexOf(3);
        int index3 = testArray.indexOf(1);
        assertEquals(0,index3);
        assertEquals(1,index);
        assertEquals(2,index2);

        testArray.insert(4);
        assertEquals(4,testArray.getItems().length);
        int index4 = testArray.indexOf(4);
        assertEquals(3,index4);
}
}