package psi.com;

public class ExplicitCasting {
    public static void main(String[] args) {
        double doubleValue = 123.456;
        int intValue = (int) doubleValue;

        System.out.println("Gia Tri goc (double): " + doubleValue);
        System.out.println("Gia TRi sau khi ep kieu (int): " + intValue);

        Integer integerValue = Integer.valueOf(intValue);
//        integerValue.
    }
}
