package day12;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    List<Integer> list = new ArrayList<>();

    void listHonest() {
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0)
                list.add(i);
        }
        for (int i = 300; i < 351; i++) {
            if (i % 2 == 0)
                list.add(i);
        }
        System.out.println(list);
    }
}
