package day4;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
    int [] arr = new int[100];
    int max = 0, min = 10000, count = 0,  sumEnd = 0;
    for (int i = 0; i < arr.length; i++) {
        arr[i] = rand.nextInt(10000);  // max = 40
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] % 10 == 0) {
                count++;
                sumEnd += arr[i];
            }
    }
    for (int x : arr)
        System.out.print (x + " ");
        System.out.println();

        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
        System.out.println(sumEnd);



    }
}
