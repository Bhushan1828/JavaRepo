public class NarrowingTypeCast{
    public static void main(String[] args) {
        double doubleValue = 9.78;

        int intValue = (int) doubleValue;

        System.out.println("Original double value: " + doubleValue);
        System.out.println("After narrowing type casting to int: " + intValue);
    }
}