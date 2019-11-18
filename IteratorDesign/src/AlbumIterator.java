public class AlbumIterator {
    private Song[] song;
    private int position;
    public AlbumIterator(Song[] songs){
        this.song = songs;
    }
    /**
     * check if there is an item at the next position in the array of songs
     */
    public boolean hasNext(){
        if(position >= song.length || song[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * increments position in array and returns that song
     */
    public Song next(){
        Song retSong = song[position];
        position++;
        return retSong;
    }
}
