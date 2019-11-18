public class Album {
    private Song[] songs;
    private int count=0;
    private String name;

    /**
     * array of songs cannot not be larger than 20
     */
    public Album(String name){
        this.name = name;
        songs = new Song[20];
    }
    /**
     * adds song to array of songs if array is not full, increments count by one
     */
    public void addSong(String aName, String aArtist, double aLength, String aGenre){
        if(count>19){
            System.out.println("Album is full");
            return;
        }
        songs[count] = new Song(aName, aArtist, aLength, aGenre);
        count++;
    }
    /**
     * creates a new iterator uses the array of songs from this object
     */
    public AlbumIterator createIterator(){
        return new AlbumIterator(songs);
    }

}
