package src.ss9_testing.bai_tap.fizz_buzz;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.translate(3));
        assertEquals("Fizz", FizzBuzz.translate(9));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.translate(5));
        assertEquals("Buzz", FizzBuzz.translate(10));
    }

    @Test
     void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.translate(15));
        assertEquals("FizzBuzz", FizzBuzz.translate(30));
    }
}