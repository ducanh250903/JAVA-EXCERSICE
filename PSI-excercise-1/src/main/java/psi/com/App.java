package psi.com;

public class App {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();

        byte a = 10;
        short b = 30000;
        int c = 1_000_000;
        long d = 1_000_000_000L;
        float e = 3.14f;
        double f = 2.718281828459045;

        System.out.println("Phép toán với các kiểu dữ liệu:");
        System.out.println("byte + short: " + (a + b));
        System.out.println("int * long: " + (c * d));
        System.out.println("float / double: " + (e / f));
        System.out.println(algorithm.sum(c, c + 1));
    }
}