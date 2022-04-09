package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane plane = new Airplane("Верхняя Тойма", 25, 2500,2002);
    plane.setManufacturer("Nizniy Novgorod");
    plane.setLength(10);

plane.fillUp(14);
plane.fillUp(20);
plane.info();
    }
}
