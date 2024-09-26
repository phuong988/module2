package src.ss14_sorting.thuc_hanh.BubbleSort;

import java.util.List;


public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static int bubbleSort(int[] list) {
        boolean check = true;
        int count = 0;
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[i]) {
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                    check = false;
                    count++;
                }
            }
//            if (check) {
//                break;
//            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = BubbleSort.bubbleSort(list);
        System.out.println("Số lần thực hiện: " +count +"\n");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}

