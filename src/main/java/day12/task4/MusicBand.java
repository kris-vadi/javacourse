package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public void printMembers(List<String> members) {
        System.out.println();
        for (String member: members)
            System.out.print(member + " / ");
    }

    public static void transferMembers (MusicBand a, MusicBand b) {
        for (String member: a.getMembers())
            b.getMembers().add(member);
        a.getMembers().clear();
    }
}
