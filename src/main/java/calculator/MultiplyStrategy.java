package calculator;

public class MultiplyStrategy implements OperationStrategy {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public String getName() {
        return "Multiplication";
    }
}
