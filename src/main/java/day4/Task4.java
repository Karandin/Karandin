package day4;
import java.util.*;
public class Task4 {
    public static void main(String[] args) {
    Random rand = new Random();
    int [] arr = new int[100];

    int sum = 0, sum1 = 0, count = 0;

    for (int i = 0; i < arr.length; i++) {
        arr[i] = rand.nextInt(10000);
        if (i > 1) {
            sum = arr[i - 1] + arr[i - 2] + arr[i]; // 15
            if (sum > sum1) {
                sum1 = sum;
                count = i - 2;
            }
        }
     }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum1);
        System.out.println(count);
    }
}
