import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz1() {
        int number = 3;
        String result = FizzBuzz.fizzBuzz(number);
        String expected = "Fizz";
        assertEquals(expected,result);
    }

    @Test
    void fizzBuzz2() {
        int number = 5;
        String result = FizzBuzz.fizzBuzz(number);
        String expected = "Buzz";
        assertEquals(expected,result);
    }

    @Test
    void fizzBuzz3() {
        int number = 15;
        String result = FizzBuzz.fizzBuzz(number);
        String expected = "FizzBuzz";
        assertEquals(expected,result);
    }

    @Test
    void fizzBuzz4() {
        int number = 13;
        String result = FizzBuzz.fizzBuzz(number);
        String expected = "13";
        assertEquals(expected,result);
    }

    @Test
    void fizzBuzz5() {
        int number = 30;
        String result = FizzBuzz.fizzBuzz(number);
        String expected = "FizzBuzz";
        assertEquals(expected,result);
    }
}