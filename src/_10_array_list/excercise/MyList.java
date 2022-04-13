package _10_array_list.excercise;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
     Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int initialCapacity) {
        if (initialCapacity > 0) {
            elements = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("initialCapacity" + initialCapacity);
        }

    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E element) {
        if (size == elements.length) {
           this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;

    }
    public void add(E element,int index ){
        if(index>size){
            throw new IllegalArgumentException("index"+index);
        }else if(size==elements.length){
            this.ensureCapacity(10);
        }
        if (elements[index] != null) {
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index]=element;
        size++;
    }public E get( int index){
       return (E) elements[index];
    }
    public  int indexOf(E element1){
        int index=-1;
        for (int i = 0; i <size ; i++) {
            if(elements[i].equals(element1)){
                return index=i;
            }

        }
        return index;
    }
    public boolean contain(E element){
        return indexOf(element) > 0;

    }
    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements,size);
        v.size =this.size;
        return v;
    }
    public E remove(int index){
        if(index<0||index>this.size){
            throw new IllegalArgumentException("index"+index);
        }else {
            E element = (E) elements[index];
            for ( int i=index;i < size-1;i++){
                elements[i]=elements[i+1];
            }elements[size-1]=null;
            size--;
            return element;
        }

    }


}


