package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("shoes.csv");
        try {
            PrintWriter pw = new PrintWriter("missing_shoes.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] arr = sc.nextLine().split(";");
                int x = Integer.parseInt(arr[2]);
                if (x == 0)
                    pw.println(Arrays.toString(arr));// или pw.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
            }
            sc.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}