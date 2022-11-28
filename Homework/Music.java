import java.util.ArrayList;
import java.util.LinkedList;

/*
Звукозапись. Определить иерархию музыкальных композиций. Записать
на диск сборку. Подсчитать продолжительность. Провести перестановку
композиций диска на основе принадлежности к стилю. Найти композицию,
соответствующую заданному диапазону длины треков.
 */
public class Music {
    public static void main(String[] args) {
        Discs.disc1();
        System.out.println();
        Discs.disc2();
    }
}

abstract class Song {
    private String singer;
    private String name;
    private double duration;
    private String genre;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Song(String singer, String name, double duration, String genre) {
        this.singer = singer;
        this.name = name;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "singer='" + singer + '\'' +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }
}

class YellowSubmarine extends Song {
    public YellowSubmarine() {
        super("The Beatles", "Yellow Submarine", 2.41, "Rock-N-Roll");

    }
}
class EleanorRigby extends Song {
    public EleanorRigby() {
        super("The Beatles", "Eleanor Rigby", 2.04, "Rock-N-Roll");
    }
}
class PeopleAreStrange extends Song {
    public PeopleAreStrange() {
        super("The Doors", "People Are Strange", 2.13, "Rock-N-Roll");
    }
}
class RidersOnTheStorm extends Song {
    public RidersOnTheStorm() {
        super("The Doors", "Riders On The Storm", 7.08, "Rock-N-Roll");
    }
}
class LightMyFire extends Song {
    public LightMyFire() {
        super("The Doors", "Light My Fire", 7.11, "Rock-N-Roll");
    }
}

class DescendingAngel extends Song {
    public DescendingAngel() {
        super("The Misfits", "Descending Angel", 3.46, "Punk-Rock");
    }
}
class Vampira extends Song {
    public Vampira() {
        super("The Misfits", "Vampira", 1.22, "Punk-Rock");
    }
}
class Scream extends Song {
    public Scream() {
        super("The Misfits", "Scream!", 2.34, "Punk-Rock");
    }
}
class InTheDoorway extends Song {
    public InTheDoorway() {
        super("The Misfits", "In the Doorway", 1.25, "Punk-Rock");
    }
}
class Discs { //Facade
    //private static ArrayList<Song> songs = new ArrayList<>();
    //static Song song1 = new YellowSubmarine();
    public static void disc1() {
        Song song1 = new YellowSubmarine();
        Song song2 = new EleanorRigby();
        Song song3 = new PeopleAreStrange();
        Song song4 = new RidersOnTheStorm();
        Song song5 = new LightMyFire();
        System.out.println(song1.getGenre() + " album:");
        System.out.println("1." + song1.getSinger() + " — " + song1.getName() + "\t\t" + song1.getDuration());
        System.out.println("2." + song2.getSinger() + " — " + song2.getName() + "\t\t\t" + song2.getDuration());
        System.out.println("3." + song3.getSinger() + " — " + song3.getName() + "\t\t" + song3.getDuration());
        System.out.println("4." + song4.getSinger() + " — " + song4.getName() + "\t\t" + song4.getDuration());
        System.out.println("5." + song5.getSinger() + " — " + song5.getName() + "\t\t\t\t" + song5.getDuration());
    }
    public static void disc2() {
        Song song1 = new DescendingAngel();
        Song song2 = new Vampira();
        Song song3 = new Scream();
        Song song4 = new InTheDoorway();
        System.out.println(song1.getGenre() + " album:");
        System.out.println("1." + song1.getSinger() + " — " + song1.getName() + "\t\t" + song1.getDuration());
        System.out.println("2." + song2.getSinger() + " — " + song2.getName() + "\t\t\t\t\t" + song2.getDuration());
        System.out.println("3." + song3.getSinger() + " — " + song3.getName() + "\t\t\t\t\t" + song3.getDuration());
        System.out.println("4." + song4.getSinger() + " — " + song4.getName() + "\t\t\t" + song4.getDuration());
    }
}
