package xyz.aldairzamora.bgn.four.classes;

public class Musician extends Human {
    private String musicSchool;
    private String genre;
    private List<String> songs;

    //constructors
    public Musician(String name, int age, float height, String musicSchool, String genre) {
        super(name, age, height);
        this.musicSchool = musicSchool;
        this.genre = genre;
    }


    // methods
    public int computeAndPrintttl() {
        return (LIFESPAN - getAge()) / 2;
    }


    // getters and setters

    public String getMusicSchool() {
        return musicSchool;
    }

    public void setMusicSchool(String musicSchool) {
        this.musicSchool = musicSchool;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
