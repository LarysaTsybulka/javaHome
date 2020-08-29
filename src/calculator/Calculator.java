package calculator;

public class Calculator {
     private CalculatorParametrs parametrs;

    public Calculator(CalculatorParametrs parametrs) {
        this.parametrs = parametrs;
    }

    public int addition() {
        return parametrs.getA() + parametrs.getB();
    }

    public int subtraction() {
        return parametrs.getA() - parametrs.getB();
    }

    public int multiplication() {
        return parametrs.getA() * parametrs.getB();
    }

    public int division() {
        return parametrs.getA() / parametrs.getB();
    }
}
