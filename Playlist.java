import java.util.ArrayList; 
import java.util.Iterator;

 public  class Playlist {
private String PlayListName;
private ArrayList<Song> ListOfSongs= new ArrayList<Song>(); 
public Iterator move = ListOfSongs.listIterator();
public Iterator getMove() {
	return move;
}

public void setMove(Iterator move) {
	this.move = move;
}

private int numOfSongs = 0;



public Playlist(String PlayListName) {
	this.PlayListName = PlayListName;
//	ListOfSongs = new ArrayList<Song>();
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
public void Start() throws InterruptedException {//throws InterruptedException {
	//for(int i=0; i<ListOfSongs.lastIndexOf();i++) {
		for(Song NowPlaying :this.getListOfSongs()) {
		//Song NowPlaying = ListOfSongs.get(i);
		System.out.println("Now Playing : " + NowPlaying.getName() );
		NowPlaying.Play();
		NowPlaying.wait();
		//Thread.sleep(NowPlaying.duration);
		//System.out.println(NowPlaying.duration);
	}
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
