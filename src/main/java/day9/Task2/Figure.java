package day9.Task2;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Methods

    public abstract double area();

    public abstract double perimeter();

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) ;
            sum += figure.perimeter();
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.area();
        }
        return sum;
    }
}
