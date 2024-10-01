package src.ss13.Searching.thuc_hanh.algorithm_complexity;

import java.util.*;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


    int[] frequentChar = new int[255]; // {1}
        for (int i = 0; i < inputString.length(); i++) { // {2}
        // Tìm ví trí tương ứng của ký tự trong bảng ASCII
        int ascii = (int) inputString.charAt(i); // {3}
        // Tăng giá trị tần suất
        frequentChar[ascii] += 1; // {4}
    }

    // Bước 3: Tìm ký tự có tần suất xuất hiện nhiều nhất
    int max = 0; // {5}
    char character = (char) 255; // {6} /* empty character */
        for (int j = 0; j < 255; j++) { // {7}
        if (frequentChar[j] > max) { // {8}
            max = frequentChar[j]; // {9}
            character = (char) j; // {10}
        }
    }

    // In ra kết quả
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
}

}
