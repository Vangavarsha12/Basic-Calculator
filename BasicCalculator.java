import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter The Number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        //Select The Operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        //Enter The Second Number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            //Result
            System.out.println("Error: Invalid operator.");
        }
    }
}