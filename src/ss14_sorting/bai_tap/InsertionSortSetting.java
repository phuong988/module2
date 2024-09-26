package src.ss14_sorting.bai_tap;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


    public class InsertionSortSetting {
        public static void main(String[] args) {
            InsertionSortSetting sorter = new InsertionSortSetting();
            sorter.insertionSort();
        }

        public void insertionSort() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array");
            int size = scanner.nextInt();
            int[] list = new int[size];
            System.out.println("Enter the elements of array:");
            for (int i = 0; i < size; i++) {
                list[i] = scanner.nextInt();
            }
            System.out.println("Initial array:");
            for (int i = 0; i < size; i++) {
                System.out.print(list[i] + " ");
            }
            for (int i = 1; i < list.length; i++) {
                int current = list[i];
                int j= i - 1;
                while(j < size && list[j] > current){
                    list[j + 1] = list[j];
                    j--;  // Move the greater elements to one position ahead of their current position.
                }
                list[j+1] = current;
            }
            System.out.println("Sorted array:");
            for (int i = 0; i < size; i++) {
                System.out.print(list[i] + " ");
            }
        }
    }