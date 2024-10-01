package src.ss10_dsa_list.bai_tap.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.addFirst(0);
        list.addLast(4);

        System.out.println("List size: " + list.size());   // Output: List size: 5
        System.out.println("Element at index 1: " + list.get(1));  // Output: Element at index 1: 1
        System.out.println("First element: " + list.getFirst());   // Output: First element: 0
        System.out.println("Last element: " + list.getLast());
    }
}
