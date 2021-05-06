package com.ArrayImpl;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }
    public Array() {
        items = new int[0];
    }
    public void setItem(int[] items) {
        this.items = items;
        count = items.length;
    }
    public int[] getItems() {
        return items;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }
    public void print() {
        for(int i = 0;i < count;i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int item) {
        int[] newArray = new int[++count];
        for(int i=0; i < items.length;i++){
            newArray[i] = items[i];
        }
        newArray[count-1] = item;
        items = newArray;
    }
    public void removeAt(int index) {
        if(index < 0 || index > getCount()){
            throw new ArrayIndexOutOfBoundsException("Index Input Is Out Of Bound");
        }
        int[] newArr = new int[count-1];
        for(int i = 0; i < index;i++){
            newArr[i] = items[i];
        }
        count--;
        for(int i = index + 1; i < count;i++){
            newArr[i] = items[i];
        }
        items = newArr;
    }
    public int indexOf(int item) {
        for(int i =0; i < getItems().length;i++){
            if(items[i] == item){
                return i;
            }
        }
        return item;
    }


//   private int[] items;//elements
//   private int count;//iterator count
//
//   public Array(int length){
//       items = new int[length];
//   }
//   public void print(){
//       for (int i=0; i < count;i++) {
//           System.out.println(items[i]);
//       }
//   }
//   public void insert(int item){
//       //if the array is full, resize it
//       if(items.length == count){
//           //Create a new Array(twice the size)
//           int[] newItems = new int[count * 2];
//           //Copy all the existing items
//           for(int i = 0;i < count; i++){
//               newItems[i] = items[i];
//           }
//           //Set "items" to this new Array
//           items = newItems;
//       }
//       //Add the new items at the end
//        items[count] = item;
//        count++;
//   }
//   public void removeAt(int index){
//       if(index < 0 || index >= count){
//           throw new IllegalArgumentException("Index Out Of Bound");
//       }
//       //Shift the items to left to fill the hole
//       for(int i = index; i < count; i++){
//           items[i] = items[i + 1];
//       }
//       count--;
//   }
//
//   public int indexOf(int item){
//       for(int i = 0; i < count; i++){
//           if(items[i] == item){
//               return i;
//           }
//       }
//       return item;
//   }
}
