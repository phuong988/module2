package src.ss13.bai_tap.Searching.bai_tap.binary_search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the element of the array: ");
        int n = scanner.nextInt();

        System.out.println("enter valies for list:");
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }


        arrayList.add(scanner.nextInt());
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("Enter the value to search: ");
        int value = scanner.nextInt();
        int result = binarySearch(arrayList.stream().mapToInt(Integer::intValue).toArray(), 0, arrayList.size() - 1, value);
        if( result == -1) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println( "Number " +value +" found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println(arrayList);
        int middle = (left + right) / 2;
        for (int i = 0; i < arrayList.size(); i++) {
            if (array[middle] < value) {
                left = middle + 1;
            } else if( array[middle] > value) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
