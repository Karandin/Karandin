
package day7;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int random1 = rand.nextInt(11);
        int random2 = rand.nextInt(11);
        int random3 = rand.nextInt(11);
        int random4 = rand.nextInt(11);
        int random5 = rand.nextInt(11);
        int random6 = rand.nextInt(11);

        Player p1 = new Player(random1 + 90);
        Player p2 = new Player(random2 + 90);
        Player p3 = new Player(random3 + 90);
        Player p4 = new Player(random4 + 90);
        Player p5 = new Player(random5 + 90);
        Player p6 = new Player(random6 + 90);
        Player.info();

        while (p1.getStamina() != 0)
            p1.run();

        Player.info();
    }
}