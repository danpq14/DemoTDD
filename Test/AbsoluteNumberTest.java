import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(result, expected);
    }

    @Test
    void testFindAbsolute1() {
        int number = 13;
        int expected = 13;
        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(result, expected);
    }
    @Test
    void testFindAbsolute2() {
        int number = -13;
        int expected = 13;
        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(result, expected);
    }
}