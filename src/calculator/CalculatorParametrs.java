package calculator;

public class CalculatorParametrs {
    private int a;
    private int b;

    private CalculatorParametrs(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static class Builder{
        private int a;
        private int b;

        public Builder setA(int a) {
            this.a = a;
            return this;
        }

        public Builder setB(int b) {
            this.b = b;
            return this;
        }

        public CalculatorParametrs build(){
            return new CalculatorParametrs(a,b);
        }

    }

}
