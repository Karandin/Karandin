package day6;


public class Task1 {
    public static void main(String[] args) {
    Car car1 = new Car();
    car1.setYear(1992);

    Motobike mot1 = new Motobike("sosiska", "red", 2017);

    mot1.info();
    car1.info();

        System.out.println(car1.yearDifferenc(1990));
        System.out.println(mot1.yearDifferenc(1221));
    }
}
