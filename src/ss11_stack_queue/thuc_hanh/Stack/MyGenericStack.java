package src.ss11_stack_queue.thuc_hanh.Stack;
import java.util.EmptyStackException;
import java.util.LinkedList;

import static javafx.beans.binding.Bindings.isEmpty;


public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public  MyGenericStack() {
        stack = new LinkedList<>();

    }

    //thêm ptu
    public void push(T element) {
        stack.addFirst(element);
    }

    //Lấy ptu
    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    private boolean isEmpty() {
        if(stack.size() == 0) {
            return true;
        }
        return false;
    }


}
