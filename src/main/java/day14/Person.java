package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
private String name;
private int age;

    public int getAge() {
        return age;
    }

    public Person (String name, int age) {
    this.name = name;
    this.age = age;
}

   public static List<Person> parseFileToObjList(File file) {
    List<Person> result = new ArrayList<>();
       try {
           Scanner sc = new Scanner(file);
           while (sc.hasNextLine()) {
               Person p1 = new Person(sc.next(), sc.nextInt());
               if (p1.getAge() < 0)
                   throw new IOException();

               result.add(p1);
           }
           System.out.println(result);
           return result;
       } catch (FileNotFoundException e) {
           System.out.println("Файл не найден");
       } catch (IOException e) {
           System.out.println("Некорректный входной файл");
       }
       return null;
   }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
