package ss3_array.bai_tap;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello world";
        int count = 0;

        System.out.println("Enter a characters: ");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Number of appearances: " + count);

    }
}
