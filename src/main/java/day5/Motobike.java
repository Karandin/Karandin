package day5;

public class Motobike {
    private String model, color;
    private int year;

    public Motobike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
