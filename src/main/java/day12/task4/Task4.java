package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersOne = new ArrayList<>();
        membersOne.add("Tourist");
        membersOne.add("Tolstov");

        List<String> membersTwo = new ArrayList<>();
        membersTwo.add("Zebra");
        membersTwo.add("Dima");

        MusicBand mb1 = new MusicBand("mb1", 12, membersOne);
        MusicBand mb2 = new MusicBand("mb2", 13, membersTwo);

        MusicBand.transferMembers(mb1, mb2);
        mb2.print();
        mb1.print();

    }
}
