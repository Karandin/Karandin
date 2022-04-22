package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int x = 1;
        MusicBand s1 = new MusicBand("Snarky puppy", 2015);
        MusicBand s2 = new MusicBand("rhcp", 1984);
        MusicBand s3 = new MusicBand("Shumi", 2014);
        MusicBand s4 = new MusicBand("Led zeppelin", 1970);
        MusicBand s5 = new MusicBand("Queen",1971);
        MusicBand s6 = new MusicBand("Alisa", 2022);
        MusicBand s7 = new MusicBand("Abba", 1999);
        MusicBand s8 = new MusicBand("Kuvalda", 1995);
        MusicBand s9 = new MusicBand("Sheben`", 2013);
        MusicBand s10 = new MusicBand("Otdai Teleskop", 2019);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(s1);
        bands.add(s2);
        bands.add(s3);
        bands.add(s4);
        bands.add(s5);
        bands.add(s6);
        bands.add(s7);
        bands.add(s8);
        bands.add(s9);
        bands.add(s10);
        Collections.shuffle(bands);
        System.out.println(bands);
        groupsAfter2000(bands);


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> lists = new ArrayList<>(bands);
        List<MusicBand> list = new ArrayList<>();

        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getYear() > 2000) {
                list.add(lists.get(i));
            }
        }
        System.out.println(list);
        return lists;
    }
}
