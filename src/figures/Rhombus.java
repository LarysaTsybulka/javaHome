package figures;

public class Rhombus extends Figure{
    private int a;
    private int h;

    public Rhombus(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double area(){
        double S;
        S = a*h;
        return S;
    }
}
