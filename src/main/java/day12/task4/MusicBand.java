package day12.task4;


import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.members = members;
        this.name = name;
        this.year = year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    // Methods

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(MusicBand band1, MusicBand band2){
        for (String a : band1.getMembers()) {
            band2.getMembers().add(a);
        }
            band1.getMembers().clear();
    }

    public void print () {
        System.out.println(this.members);
    }
}
