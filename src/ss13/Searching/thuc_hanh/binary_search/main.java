package src.ss13.thuc_hanh.binary_search;

import static src.ss13.thuc_hanh.binary_search.BinarySearch.binarySearch;
import static src.ss13.thuc_hanh.binary_search.BinarySearch.list;

public class main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
