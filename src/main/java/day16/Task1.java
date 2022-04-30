package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\misak\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\file.txt");

        printResult(file);
    }
    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            String [] arr = sc.nextLine().split(" ");
            int [] numbers = new int [arr.length];
            for (int i = 0; i < arr.length; i++)
                numbers[i] = Integer.parseInt(arr[i]);

            double sum = 0;
            for (int i = 0; i < numbers.length; i++)
                 sum += numbers[i];

            sum /= numbers.length;

            System.out.println(sum);
            System.out.format("%.3f", sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

