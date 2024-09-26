package src.ss15.thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Arrays;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Interger[] arr = arrExample.createRandom();
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
