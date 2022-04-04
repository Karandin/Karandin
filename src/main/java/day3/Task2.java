package day3;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 1.0;
        double y = 1.0;
        while ( x!= 0 && y != 0) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            System.out.println(x / y);
        }
    }
}
