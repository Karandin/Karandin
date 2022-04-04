package day3;
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i <5; i++) {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x==0) {
            System.out.println("Деление на 0");
            continue;
        }
        System.out.println(x/y);
    }
    }
}
