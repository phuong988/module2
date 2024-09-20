package src.ss8_clean_code_and_refactoring.thuc_hanh;

public class Calculator {
    public static int calculate(int firstOperand, int secondOpernd, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOpernd;
            case '-':
                return firstOperand - secondOpernd;
            case '*':
                return firstOperand * secondOpernd;
            case '/':
                if (secondOpernd != 0)
                    return firstOperand / secondOpernd;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }}
