package day7;

public class Task1 {
    public static void main(String[] args) {
    Airplane p1 = new Airplane("Spb", 25, 4000, 2020);
    Airplane p2= new Airplane("Moscow", 30, 5000, 2021);
    Airplane.compareAirplanes(p1, p2);
    }
}