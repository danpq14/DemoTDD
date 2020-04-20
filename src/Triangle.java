public class Triangle {
    public static String TriangleClassfier(double a, double b, double c) {
        String result;
        if (a+b > c && a+c > b && b+c > a) {
            if (a == b || a == c || b == c) {
                if (a == b && a == c) {
                    result = "tam giác đều";
                }
                else {
                    result = "tam giác cân";
                }
            }
            else {
                result = "tam giác thường";
            }
        }
        else {
            result = "ko phải tam giác";
        }
        return result;
    }
}
