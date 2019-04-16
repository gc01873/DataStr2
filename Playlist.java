import java.util.ArrayList; 
import java.util.Iterator;

public class Playlist {
private String PlayListName;
private ArrayList<Song> ListOfSongs = new ArrayList<Song>();
private Iterator move = ListOfSongs.listIterator();
private int numOfSongs = 0;



public Playlist(String PlayListName) {
	this.PlayListName = PlayListName;
}

public void AddSong(Song song) {
	ListOfSongs.add(song);
	numOfSongs++;
}
public Song  RemoveSong(Song song) {
	ListOfSongs.remove(song);
	numOfSongs--;
	return song;
}

public int getNumOfSongs() {
	return numOfSongs;
}

public void setNumOfSongs(int numOfSongs) {
	this.numOfSongs = numOfSongs;
}

public String getPlayListName() {
	return PlayListName;
}

public void setPlayListName(String playListName) {
	PlayListName = playListName;
}

public ArrayList<Song> getListOfSongs() {
	return ListOfSongs;
}

public void setListOfSongs(ArrayList<Song> listOfSongs) {
	ListOfSongs = listOfSongs;
}


}
