package src.ss14_sorting.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Initial array:");
        printList(list);
        insertionSort(list);
    }

    public static void insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int currentElement = list.get(i);
            int j = i - 1;

            // Di chuyển các phần tử đã sắp xếp lớn hơn currentElement về bên phải
            while (j >= 0 && list.get(j) > currentElement) {
                list.set(j + 1, list.get(j));
                j--;
            }
            // Đặt currentElement vào vị trí đúng
            list.set(j + 1, currentElement);

            // In mảng sau mỗi lần chèn
            System.out.println("After inserting element " + currentElement + ":");
            printList(list);
        }
    }

    public static void printList(List<Integer> list) {
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}

