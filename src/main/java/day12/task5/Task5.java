package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> artists1 = new ArrayList<>();
        artists1.add(new MusicArtist("Tourist", 12));
        artists1.add(new MusicArtist("Tolstov", 13));

        List<MusicArtist> artists2 = new ArrayList<>();
        artists2.add(new MusicArtist("Zebra", 2));
        artists2.add(new MusicArtist("Dima", 16));


        //MusicArtist n = new MusicArtist("s", 1);
        MusicBand a = new MusicBand("Sheben`", 2, artists1);
        MusicBand b = new MusicBand("Teleskop", 3, artists2);

        MusicBand.transferMembers(a, b);
        a.print();
        b.print();
    }
}
