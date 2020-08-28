package figures;

import figures.Circle;

public class FigureMain {
    public static void main(String[] args){
        Triangle triangle = new Triangle(4,7,8);
        System.out.println("Площадь треугольника равна: "+triangle.area());
        Square square = new Square(9);
        System.out.println("Площадь квадрата равна: "+square.area());
        Rhombus rhombus = new Rhombus(7,5);
        System.out.println("Площадь ромба равна: "+rhombus.area());
        Circle circle = new Circle(14);
        System.out.println("Площадь квадрата равна: "+circle.area());
    }
}
