package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        PrintWriter pw = new PrintWriter(file1);

        double num = 0;
        int x = 0;
        // Заполнение 1 файла рандомными числами
        for (int i = 0; i < 1000; i++) {
            num = Math.round(Math.random() * 100);
            x = (int) num;
            pw.println(x);
        }
        pw.close();
        // Создание 2 файла
        Scanner sc = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        //Заполнение второго файла через циклы
        while (sc.hasNextLine()) {
            int sum = 0;
            for (int i = 0; i < 20; i++) {
                sum += Integer.parseInt(sc.nextLine());
            }
            pw2.println(sum / 20.0);
        }
        pw2.close();
        sc.close();
        printResult(file2);
    }

    public static void printResult(File file) {
        double result = 0.0;
        int resultInt = 0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                result += Double.parseDouble(sc.nextLine());
            }
            resultInt = (int) result;
            System.out.println(resultInt);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
