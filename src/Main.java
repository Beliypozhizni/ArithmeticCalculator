public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(20.0, 5.0);

        System.out.println("Сложение: " + calculator.calculate(Operation.ADD));
        System.out.println("Вычитание: " + calculator.calculate(Operation.SUBTRACT));
        System.out.println("Деление: " + calculator.calculate(Operation.MULTIPLY));
    }
}