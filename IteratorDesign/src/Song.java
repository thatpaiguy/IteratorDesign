/**
 * Song object with attributes, constructor and print method
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private String genre;
    public Song(String aName, String aArtist, double aLength, String aGenre){
        this.name = aName;
        this.artist = aArtist;
        this.length = aLength;
        this.genre = aGenre;
    }
    public void print(){
        System.out.println("Name: " + name + " by " + artist+ " Category: " + genre+" Length: " + length);
    }
}
