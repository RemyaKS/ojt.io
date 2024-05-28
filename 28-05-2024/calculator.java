public class calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 4;
        System.out.println("Addition : " + calculator.add(num1, num2));
        System.out.println("Subtraction : " + calculator.subtract(num1, num2));
        System.out.println("Multiplication : " + calculator.multiply(num1, num2));
        System.out.println("Division : " + calculator.divide(num1, num2));
    }
}
