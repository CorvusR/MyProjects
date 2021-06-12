package Tests;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(0 / 0);
            throw Exception(ArithmeticException);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
