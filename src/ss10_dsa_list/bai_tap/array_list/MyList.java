package src.ss10_dsa_list.bai_tap.array_list;
import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity <= 0) {
            elements = new Object[DEFAULT_CAPACITY];
        } else {
            elements = new Object[capacity];
        }
    }

    private void ensureCapa() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size == elements.length) {
            ensureCapa();
        }
        // di chuyển các phần tử từ vị trí index
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        // them phần tử mới vào vị trí index
        elements[index] = element;
        size++;
    }

    public E get(int i) {
        if(i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = (E) elements[index];
        for(int i = index; i < size - 1; i++) {
            elements[i] = elements[i +1];
        }
        elements[size - 1] = null;
        return removedElement;
    }

    public int size() {
        return size;
    }

    //phuong thu sao chep
    public E clone() {
        MyList<E> clonedList = new MyList<>(size);
        for(int i = 0; i < size; i++) {
            clonedList.add((E) elements[i]);
        }
        return (E) clonedList;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
        return true;
    }


    // kiem tra ptu co ton tai khong
    public boolean contains(E o) {
        for(int i = 0; i < size; i++) {
            if(elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    //tim chi so cua phan tu
    public int indexOf(E o) {
        for(int i = 0 ; i < size ; i++ ) {
            if(elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    // dam bao dung luong toi thieu
    public void ensureCapacity(int minCapacity) {
        if(minCapacity > elements.length) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    //xoa tat ca ptu
    public void clear() {
        for(int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
