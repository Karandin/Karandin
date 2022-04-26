package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\misak\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\file.txt");
        printSumDigits(file);
    }
    public static void printSumDigits (File file) throws IOException {
        try {
            Scanner sc = new Scanner(file);
            String st = sc.nextLine();
            String [] arr = st.split(" ");
            int sum = 0;

            if (arr.length != 10) {
            throw new IOException();
            }

            int [] numbers = new int [10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = Integer.parseInt(arr[i]);
                sum += numbers[i];
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
