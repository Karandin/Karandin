package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    File file = new File("C:\\Users\\misak\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\People.txt");
        parseFileToStringList(file);
    }
   public static List<String> parseFileToStringList(File file){
        List<String> result = new ArrayList<>();
       try {
           Scanner sc = new Scanner(file);
           while (sc.hasNextLine()){
               String st = sc.nextLine();
               String [] arr = st.split(" ");
               int x = Integer.parseInt(arr[1]);
               if (x < 0) {
                   throw new IOException();
               }
               result.add(st);
           }
           sc.close();
           System.out.println(result);
       } catch (FileNotFoundException e) {
           System.out.println("Файл не найден");
       } catch  (IOException e) {
           System.out.println("Некорректный входной файл");
       }
       return result;
   }
}
