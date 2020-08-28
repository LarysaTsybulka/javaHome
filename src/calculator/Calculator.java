package calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int addition() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public int multiplication() {
        return a * b;
    }

    public int division() {
        return b != 0 ? a / b : 0;
    }
}
