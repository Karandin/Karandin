package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\misak\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("[.,:;()?!\"\\s–]+");
        Map<String, Integer> map = new HashMap<>();

        while (sc.hasNext()) {
            String s = sc.next();
            if (!map.containsKey(s))
                map.put(s, 1);
            else
                map.put(s, map.get(s) + 1);
        }
        sc.close();
        // map.get("Чичиков"); -> "Чичиков" 601 раз.
        List<String> list = new ArrayList<>();

        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        int maxValueInMap = (Collections.max(map.values()));

        for (int i = 0; i < 99; i++) {
            list.add(key + " = " + maxValueInMap);
            map.remove(key, maxValueInMap);
            key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            maxValueInMap = (Collections.max(map.values()));
        }
        System.out.println(list);
    }
}

