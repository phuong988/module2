package src.ss9_testing.bai_tap.fizz_buzz;

public class FizzBuzz {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";


    public static String translate(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return FIZZ_BUZZ;
        } else if (isFizz(number)) {
            return FIZZ;
        } else if (isBuzz(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

}