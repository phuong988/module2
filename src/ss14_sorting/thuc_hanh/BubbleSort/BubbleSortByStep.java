package src.ss14_sorting.thuc_hanh.BubbleSort;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter the elements of the array:");
        for( int i = 0 ; i < size; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("\nBegin sort propesing...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean check = true;
        for(int j = 1; j < list.length ; j++) {
            check = false;
            for(int i = 0; i < list.length - j; i++) {
                if(list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    check = true;
                }
            }
            if(!check) {
                System.out.println("Array may be sorted and next pass not needed.");
                break;
            }
            System.out.print("List after the  " + j + "' sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();
        }
    }
}
