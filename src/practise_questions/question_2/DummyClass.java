package practise_questions.question_2;

public class DummyClass {

    static int staticSubtractMethod(int a, int b) {
        return a - b;
    }
    static int staticAdditionMethod(int a, int b) {
        return a + b;
    }

    float instanceMultiplicationMethod(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        CalculationInterface calculationInterface = DummyClass::staticAdditionMethod;
        System.out.println("calculate addition using static addition method - " +
                calculationInterface.calculate(2, 3));

        calculationInterface = DummyClass :: staticSubtractMethod;
        System.out.println("calculate subtraction using static addition method - " +
                calculationInterface.calculate(5, 2));

        calculationInterface = new DummyClass() :: instanceMultiplicationMethod;
        System.out.println("calculate multiplication using static addition method - " +
                calculationInterface.calculate(2, 3));
    }
}
