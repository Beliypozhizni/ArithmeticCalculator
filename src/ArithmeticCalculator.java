public class ArithmeticCalculator {
    private final double firstOperand;
    private final double secondOperand;

    public ArithmeticCalculator(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public double calculate(Operation operation) {
        switch (operation) {
            case Operation.ADD -> {
                return firstOperand + secondOperand;
            }
            case Operation.SUBTRACT -> {
                return firstOperand - secondOperand;
            }
            case Operation.MULTIPLY -> {
                return firstOperand / secondOperand;
            }
            default -> {
                return 0;
            }
        }
    }
}
