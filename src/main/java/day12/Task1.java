package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> avto = new ArrayList<>();
        avto.add("lada");
        avto.add("mercedes");
        avto.add("tesla");
        avto.add("toyota");
        avto.add("kamaz");
        avto.add(2, new String("hyndai"));
        avto.remove(0);
        System.out.println(avto);
    }
}
