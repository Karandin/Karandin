package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\misak\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        HashMap<Integer, Point> map = new HashMap<>();
        // Считываю файл
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                map.put(sc.nextInt(), new Point(sc.nextInt(), sc.nextInt()));
                if (sc.hasNext())
                    sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        // Создаю переменные чтобы хранить данные пользователя
        Scanner scInput = new Scanner(System.in);
        int x1 = scInput.nextInt();
        int x2 = scInput.nextInt();
        int y1 = scInput.nextInt();
        int y2 = scInput.nextInt();
        // С помощью этих переменных будем проверять корректность введенного квадрата
        int sumX = x1 - x2;
        sumX = Math.abs(sumX);
        int sumY = y1 - y2;
        sumY = Math.abs(sumY);
        //Переменные в которые буду класть ключ\значение
        int xNewMap = 0;
        int yNewMap = 0;
        //Создаю новую пустую карту, пробегаюсь по старой, нужные значения выписываю в новую. Получилось только через кучу вложенных if-ов решить.
        HashMap<Integer, Integer> newMap = new HashMap<>();
        if ((x2 != x1) && (y2 != y1) && (sumX == sumY)) {
            int count = 1;
            if (x1 > x2) {
                for (Map.Entry<Integer, Point> entry : map.entrySet()) {
                    Point p = map.get(count);
                    xNewMap = p.getX();
                    yNewMap = p.getY();
                    if (xNewMap > x2 && xNewMap < x1 && yNewMap < sumX)
                        newMap.put(xNewMap, yNewMap);
                    count++;
                }
            } else {
                for (Map.Entry<Integer, Point> entry : map.entrySet()) {
                    Point p = map.get(count);
                    xNewMap = p.getX();
                    yNewMap = p.getY();
                    if (xNewMap < x2 && xNewMap > 1 && yNewMap <sumX)
                        newMap.put(xNewMap, yNewMap);
                    count++;
                }
            }
        }
        System.out.println(newMap);
    }
}

