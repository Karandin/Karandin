package day2;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a>=b) {
        System.out.print("Некорректный ввод");
    }
    for (int i = a; i < b-1; i++) {
        if (i % 5 == 0 && i % 10 != 0) {
            System.out.print(i + " ");
        }
    }
    }
}
