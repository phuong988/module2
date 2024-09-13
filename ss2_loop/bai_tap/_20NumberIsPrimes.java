package ss2_loop.bai_tap;

import java.util.Scanner;

public class _20NumberIsPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println(N);
            }
            N++;

        }

    }
}
