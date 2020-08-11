package sample;

import java.io.Serializable;

/**
 * Sample arraylist example
 */
public class MyArrayList implements Serializable {

  private static final int DEFAULT_CAPACITY = 10;

  //used for initialize list
  private static final Object[] EMPTY_ELEMENT_DATA = {};

  //data saved list
  transient Object[] elementData;

  //actual list size
  private int size;

  public MyArrayList() {
    this.elementData = EMPTY_ELEMENT_DATA;
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity > 0) {
      this.elementData = new Object[initialCapacity];
    } else if (initialCapacity == 0) {
      this.elementData = EMPTY_ELEMENT_DATA;
    } else {
      throw new IllegalArgumentException("Invalid initial capacity");
    }
  }

  public boolean add(Object e) {
    ensureCapacityInternal(size + 1);
    elementData[size++] = e;
    return true;
  }

  private void ensureCapacityInternal(int minCapacity) {

    //if the first time, use the default value
    if (elementData == EMPTY_ELEMENT_DATA) {
      minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
    }

    //check if the elementData length is enough for the minCapacity
    if (minCapacity - elementData.length > 0) {
      int oldCapacity = elementData.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);

      //if the newCapacity is still not enough,use the min capacity
      if (newCapacity - minCapacity < 0) {
        newCapacity = minCapacity;
      }

      //Create a new object and copy the old elementData to the new array
      Object[] objects = new Object[newCapacity];
      System.arraycopy(elementData, 0, objects, 0, elementData.length);

      //change the reference of elementData
      elementData = objects;
    }
  }

  public Object get(int index) {
    rangeCheck(index);
    return elementData[index];
  }

  private void rangeCheck(int index) {
    if (index >= size || size < 0) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
  }

  public int indexOf(Object o) {
    if (o == null) {
      for (int i = 0; i < size; i++) {
        if (elementData[i] == null) {
          return i;
        }
      }
    } else {
      for (int i = 0; i < size; i++) {
        if (o.equals(elementData[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  public boolean set(int index, Object o) {
    rangeCheck(index);
    elementData[index] = o;
    return true;
  }

  public boolean remove(int index) {
    rangeCheck(index);

    int numMoved = size - index - 1;

    //copy the rest element to the right position
    if (numMoved > 0) {
      System.arraycopy(elementData, index + 1, elementData, index, numMoved);
    }

    elementData[--size] = null; //free memory for gc

    return true;
  }

  public int size() {
    return this.size;
  }
}
