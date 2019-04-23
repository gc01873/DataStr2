package Home;

import java.io.Serializable;

import java.util.ArrayList; 


import javafx.scene.media.MediaPlayer.Status;

public  class Playlist implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private String PlayListName;
	private ArrayList<Song> ListOfSongs= new ArrayList<Song>(); 

	


	private int numOfSongs = 0;

	public static void main(String[] args)  {
	
		
	}
	public Playlist(String PlayListName) {
		this.PlayListName = PlayListName;

	}
	public Playlist(String PlayListName, String artist) {
		this.PlayListName = PlayListName;
		
	}
	public void AddSong(Song song) {
		ListOfSongs.add(song);
		song.setAlbum(this); 
		numOfSongs++;
	}
	public void AddSong(String name, String path) {
		Song song = new Song(name,path);
		ListOfSongs.add(song);
		song.setAlbum(this);
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
