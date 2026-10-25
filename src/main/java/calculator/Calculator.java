package calculator;


public class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(OperationStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null.");
        }
        this.strategy = strategy;
    }

    public double calculate(double firstNumber, double secondNumber) {
        return strategy.execute(firstNumber, secondNumber);
    }

    public String getCurrentOperationName() {
        return strategy.getName();
    }
}
