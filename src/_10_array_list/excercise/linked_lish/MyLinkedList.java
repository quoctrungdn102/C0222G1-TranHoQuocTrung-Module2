package _10_array_list.excercise.linked_lish;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<E> {
    private Node head;
    private int numNode = 0;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }

    public void adđFirts(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNode++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }

    public void addIndex(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNode++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E remove(int index) {
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;

        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNode--;

        }
        return (E) data;
    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        if (numNode == 0) {

            throw new IllegalArgumentException("linkedList null");
        }
            MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
            Node temp = head;
            returnLinkedList.adđFirts((E) temp.data);
            while (temp != null) {
                returnLinkedList.adđFirts((E) temp.data);
                temp = temp.next;

            }
            return returnLinkedList;
        }
        public int size(){

        return this.numNode;
        }

}



