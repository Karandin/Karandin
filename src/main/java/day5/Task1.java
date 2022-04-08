package day5;

public class Task1 {
    public static void main(String[] args) {
        Car avto = new Car();
            avto.setYear(2005);
            avto.setColor("red");
            avto.setModel("Vaz");

        System.out.println("year: " + avto.getYear() + ", color: " + avto.getColor() + ", model: " + avto.getModel());
    }
}
