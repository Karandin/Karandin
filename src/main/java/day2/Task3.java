package day2;
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a >= b) {
                System.out.print("Некорректный ввод");
            }
            while (a < b-1) {
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                } a++;
            }
        }
    }

