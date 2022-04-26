package day14;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
    File file = new File("C:\\Users\\misak\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\People.txt");
        Person.parseFileToObjList(file);
    }
}
