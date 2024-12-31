package psi.com;

public class ImlicitCasting {
    public static void main(String[] args) {
        int intValue = 50;
        long longValue = intValue;
        double doubleValue = longValue;

        System.out.println("Gia Tri int: " + intValue);
        System.out.println("Gia Tri long: " + longValue);
        System.out.println("Gia Tri double: " + doubleValue);
    }
}
