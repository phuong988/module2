package src.ss13.bai_tap.Searching.thuc_hanh.binary_search;


import static src.ss13.bai_tap.Searching.thuc_hanh.binary_search.main.list;

public class BinarySearch {

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
