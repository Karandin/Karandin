package day9.Task2;

public class Rectangle extends Figure {
    private double h;
    private double b;

    public Rectangle(double b, double h, String color) {
        super(color);
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return h * b;
    }

    @Override
    public double perimeter() {
        return 2.0 * (h + b);
    }
}
