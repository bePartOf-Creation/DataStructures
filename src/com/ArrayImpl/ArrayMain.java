package com.ArrayImpl;

public class ArrayMain {
    public static void main(String[] args) {
        Array numbers = new Array(7);
        try {
            numbers.insert(10);
            numbers.insert(20);
            numbers.insert(30);
            numbers.insert(40);
            System.out.println(numbers.indexOf(40));
            numbers.removeAt(9);

            numbers.print();
        }
        catch(IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());
        }

    }

}
