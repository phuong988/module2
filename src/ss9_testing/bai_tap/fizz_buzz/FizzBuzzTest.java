package src.ss9_testing.thuc_hanh.fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

//    @org.junit.jupiter.api.Test
//    void translate() {
//    }
    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.translate(1));
        assertEquals("Fizz", FizzBuzz.translate(3));
    }

    @Test
    void testBuzz() {
        assertEquals("buzz", FizzBuzz.translate(5));
        assertEquals("buzz", FizzBuzz.translate(10));
    }
}