package src.ss13.Searching.thuc_hanh.binary_search;


import java.util.Scanner;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if( key < list[mid]) {
                high = mid - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
