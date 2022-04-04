package day4;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int num =sc.nextInt();
        int [] arr = new int[num];
        int count1 = 0, count8 = 0, countEv = 0, countEv1 = 0;

        for (int i =0; i< arr.length;i++) {
            arr[i]=ran.nextInt(10);
            if (arr[i] == 1) count1++;
            if (arr[i] > 8) count8++;
            if (arr[i] % 2 == 0) countEv++;
            if (arr[i] % 2 !=0) countEv1++;
        }
        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Длинна массива: " + arr.length);
        System.out.println("Кол-во единиц: " + count1);
        System.out.println("Кол-во больше 8: " + count8);
        System.out.println("Кол-во чётных: " + countEv);
        System.out.println("Кол-во HE чётных: " + countEv1);
    }
}