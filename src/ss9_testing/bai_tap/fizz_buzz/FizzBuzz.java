package src.ss9_testing.thuc_hanh.fizz_buzz;

public class FizzBuzz {
    private static final String FIZZ_BUZZ = ;


    public static String translate(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return FIZZ_BUZZ;
        } else if (number % 3 == 0) {
            return FIZZ;
        } else if (number % 5 == 0) {
            return BUZZ;
        }
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
