package day2;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите кол-во этажей");
    int flats = sc.nextInt();
    if (flats >0 && flats <= 4) {
        System.out.print("Малоэтажный дом");
    }else if (flats > 4 && flats <=8) {
        System.out.print("Среднеэтажный дом");
    }else if (flats > 9) {
            System.out.print("Многоэтажный дом");
        }
    if (flats < 0) {
        System.out.print("Ошибка ввода");
    }
    }
}
