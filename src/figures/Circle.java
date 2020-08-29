package figures;

public class Circle extends Figure{
    private int d;
    private static final double PI = Math.PI;

    public Circle(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public double area(){
        double S,r;
        r = d/ 2.0;
        S = PI*r*r;
        return S;
    }
}
