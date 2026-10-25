package calculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, OperationStrategy> strategies = new LinkedHashMap<>();
        strategies.put("1", new AddStrategy());
        strategies.put("2", new SubtractStrategy());
        strategies.put("3", new MultiplyStrategy());
        strategies.put("4", new DivideStrategy());

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Strategy Calculator ===");
            System.out.println("Choose an operation:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine().trim();

            OperationStrategy selectedStrategy = strategies.get(choice);
            if (selectedStrategy == null) {
                System.out.println("Invalid operation choice.");
                return;
            }

            System.out.print("Enter the first number: ");
            double firstNumber = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Enter the second number: ");
            double secondNumber = Double.parseDouble(scanner.nextLine().trim());

            Calculator calculator = new Calculator(selectedStrategy);
            double result = calculator.calculate(firstNumber, secondNumber);

            System.out.println(calculator.getCurrentOperationName() + " result: " + result);

            calculator.setStrategy(new MultiplyStrategy());
            System.out.println("After switching strategy to Multiplication: "
                    + calculator.calculate(firstNumber, secondNumber));
        } catch (NumberFormatException exception) {
            System.out.println("Please enter valid numbers.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
