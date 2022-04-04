package day4;
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int [12][8];
        int sum;
        int secondSum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
                sum += arr[i][j];
            }
            if (sum >= secondSum) {
                count = i;
            }
            secondSum = sum;
        }

       System.out.println(Arrays.deepToString(arr));
        System.out.println(count);


    }
}