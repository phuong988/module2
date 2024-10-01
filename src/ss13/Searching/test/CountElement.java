package src.ss13.Searching.test;


import java.util.HashMap;


public class CountElement {
    public static void main(String[] args) {
        CountElement countElement = new CountElement();
        int[] arr = {1, 3, 4, 1, 2, 4, 2, 3, 5, 7};
        countElement.countDuplicate(arr);
    }



    public void countDuplicate(int arr[]) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int duplicateCount = 0;

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int frequency : countMap.values()) {
            if (frequency > 1) {
                duplicateCount++;
            }
        }

        System.out.println("Number of duplicate elements: " + duplicateCount);
    }
}

