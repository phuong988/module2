package src.ss15.thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
        Scanner caner = new Scanner(System.in);
        System.out.println("\nEnter an index to check:");
        int index = caner.nextInt();
        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
            System.out.println("Length of array: " + arr.length);
            System.out.println("Last valid index: " + (arr.length - 1));
            System.out.println("Current index: " + index);
            System.out.println("Adjust your index to be within the valid range.");
        }
    }

    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Generated array:");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }


}
