public class Square extends Figure{
    private int a;

    public Square(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public double area(){
        double S;
        S = Math.pow(a,2);
        return S;
    }
}
