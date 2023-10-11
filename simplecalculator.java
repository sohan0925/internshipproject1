import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1, operator, num2 (e.g., 5 + 3): ");
        double num1 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double num2 = scanner.nextDouble();

        double result = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (num2 == 0 ? Double.NaN : num1 / num2);
            default -> Double.NaN;
        };

        if (Double.isNaN(result)) {
            System.out.println("Invalid operation");
        } else {
            System.out.println("Result: " + result);
        }
    }
}
