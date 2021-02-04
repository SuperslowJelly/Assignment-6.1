package io.github.superslowjelly.assignment61;

public enum Calculation {

    MULTIPLICATION('*'),
    DIVISION('/'),
    ADDITION('+'),
    SUBTRACTION('-');

    Calculation(char operator) {
        this.OPERATOR = operator;
    }

    private final char OPERATOR;

    private double operand1, operand2;

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String calculate() {
        final String S = "\nYour result is: " + operand1 + " " + OPERATOR + " " + operand2 + " = ";
        switch(this.OPERATOR) {
            case '*':
                return S + (operand1 * operand2);
            case '/':
                return S + (operand1 / operand2);
            case '+':
                return S + (operand1 + operand2);
            case '-':
                return S + (operand1 - operand2);
            default:
                return "";
        }
    }

}
