public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public double area(){
        double S,p;
        p = (a+b+c)/2;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
}
