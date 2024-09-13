package ss1_introduction.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int rate = 24000;
        System.out.print("Nhập giá trị usd: ");
        double usd = sc.nextInt();
        double vnd = usd * rate;
        System.out.print(" giá trị sau khi chuyển đổi là: " + vnd);
    }
}
