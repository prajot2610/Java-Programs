public class BooleanExample {
    public static void main(String[] args) {
        Integer num1 = 5;
        Integer num2 = 5;
        Integer num3 = Integer.valueOf(5);
        Integer num4 = Integer.valueOf(5);

        boolean value1 = (num1 == num2); // False, because new Integer(5) creates different objects
        boolean value2 = (num3 == num4); // True, because Integer.valueOf(5) uses caching for small integers (-128 to 127)

        System.out.println(value1); // Output: false
        System.out.println(value2); // Output: true
    }
}
