public class RecursiveMultiplication {
    public static int multiply(int a, int b) {
    
        if (b == 0) {
            return 0;
        }

        if (b < 0) {
            return -multiply(a, -b);
        }
    
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        int num1 = 5, num2 = -3;
        int result = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + result);
    }
}
