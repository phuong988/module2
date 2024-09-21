package src.ss10_dsa_list.bai_tap.LinkedList;

import javafx.scene.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
        this.head = null;
    }
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index , E element) {
        if(index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("index: " + index + ", numNodes: " + numNodes);
        }
        Node temp = head;
        Node holder;

        if(index == 0) {
            addFirst(element);
        } else {
            for(int i = 0; i < index && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        }
    }
    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }
    // Add element at the last position
    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNodes++;
        }
    }

    // Remove element by index
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node temp = head;
        if (index == 0) {
            head = head.next;
            numNodes--;
            return (E) temp.getData();
        }
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node toRemove = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) toRemove.getData();
    }

    // Remove element by value
    public boolean remove(Object e) {
        Node temp = head;
        if (head == null) return false;

        if (head.getData().equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }

        while (temp.next != null) {
            if (temp.next.getData().equals(e)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Return the size of the list
    public int size() {
        return numNodes;
    }

    // Clone the list (shallow copy)
    public E clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            cloneList.addLast((E) temp.getData());
            temp = temp.next;
        }
        return (E) cloneList;
    }

    // Check if the list contains a certain element
    public boolean contains(E o) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Find index of a certain element
    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;  // Element not found
    }

    // Add element at the end
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    // Ensure capacity (not needed for linked list, but included in the design)
    public void ensureCapacity(int minCapacity) {
        // This method is typically used for ArrayList, not LinkedList.
        // LinkedList dynamically adjusts its size, so this method is unnecessary.
    }

    // Get element by index
    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + numNodes);
        }
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    // Get the first element
    public E getFirst() {
        if (head == null) {
            return null;
        }
        return (E) head.getData();
    }

    // Get the last element
    public E getLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    // Clear the list
    public void clear() {
        head = null;
        numNodes = 0;
    }
}


