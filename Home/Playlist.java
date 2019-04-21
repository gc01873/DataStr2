package Home;

import java.io.Serializable;
import java.util.ArrayList; 
import java.util.Iterator;

import javafx.scene.media.MediaPlayer.Status;

public  class Playlist implements Serializable {
	private String PlayListName;
	private ArrayList<Song> ListOfSongs= new ArrayList<Song>(); 
//	public static Song NowPlaying;
	public Iterator move = ListOfSongs.listIterator();
	
	public Iterator getMove() {
		return move;
	}
	

	public void setMove(Iterator move) {
		this.move = move;
	}

	private int numOfSongs = 0;

	public static void main(String[] args)  {
	
		Playlist First = new Playlist("SongLibrary");
		/* This must be changed to create a songs from a song library from a song library
		 * Using a for loop to add all of the songs to.
		 */
	}
	public Playlist(String PlayListName) {
		this.PlayListName = PlayListName;

	}
	public Playlist(String PlayListName, String artist) {
		this.PlayListName = PlayListName;
		
	}
	public void AddSong(Song song) {
		ListOfSongs.add(song);
		//song.setAlbum(this); save for album class
		numOfSongs++;
	}
	public void AddSong(String name, String path) {
		Song song = new Song(name,path);
		ListOfSongs.add(song);
		//song.setAlbum(this); save for album class
		numOfSongs++;
	}

	public Song  RemoveSong(Song song) {
		ListOfSongs.remove(song);
		numOfSongs--;
		return song;
	}
	public void Start() throws InterruptedException {
		}
	//}

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
