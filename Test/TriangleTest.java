import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangleClassifierTest1() {
        double a = 2;
        double b = 2;
        double c = 2;
        String excepted = "tam giác đều";
        String result = Triangle.TriangleClassfier(a,b,c);
        assertEquals(excepted,result);
    }

    @Test
    void triangleClassfierTest2() {
        double a = 2;
        double b = 2;
        double c = 3;
        String excepted = "tam giác cân";
        String result = Triangle.TriangleClassfier(a,b,c);
        assertEquals(excepted,result);
    }

    @Test
    void triangleClassfierTest3() {
        double a = 3;
        double b = 4;
        double c = 5;
        String excepted = "tam giác thường";
        String result = Triangle.TriangleClassfier(a,b,c);
        assertEquals(excepted,result);
    }

    @Test
    void triangleClassfierTest4() {
        double a = 8;
        double b = 2;
        double c = 3;
        String excepted = "ko phải tam giác";
        String result = Triangle.TriangleClassfier(a,b,c);
        assertEquals(excepted,result);
    }

    @Test
    void triangleClassifierTest5() {
        double a = -2;
        double b = 2;
        double c = 2;
        String excepted = "ko phải tam giác";
        String result = Triangle.TriangleClassfier(a,b,c);
        assertEquals(excepted,result);
    }
}