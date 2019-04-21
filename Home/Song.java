package Home;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class Song implements Serializable {
	private String name;
	public String artistName;
	private Artist artist; //Change to artist class
	private int year;
	private Playlist Album; //Change to album class
	private String Genre;// change to genre class
	private static int likes =0;

	private String path;

	final JFXPanel fxP = new JFXPanel(); 
	String bip;
	Media hit; 
	public Media getHit() {
		return hit;
	}

	public void setHit(Media hit) {
		this.hit = hit;
	}
	public static MediaPlayer mediaPlayer;

	public MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}

	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	public static void main(String[] args) throws InterruptedException {

	}

	public static int getLikes() {
		return likes;
	}
	public static void setLikes(int likes) {
		Song.likes = likes;
	}
	/*public Song(String name, String artist, int year,Playlist Album, String path){
		this.name = name;
		this.artistName = artist;
		this.year = year;
		this.path = path;
		this.bip = path;
		this.Album = Album;
		final JFXPanel fxP = new JFXPanel(); ;
		this.hit = new Media(new File(bip).toURI().toString());
		this.mediaPlayer = new MediaPlayer(hit);
	/*	final JFXPanel fxP = new JFXPanel(); 
		String bip = getPath();
		Media hit = new Media(new File(bip).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);

	}*/

	public Song(String Name, Artist artist, Album album) {
		this.Album = album;
		this.artist = artist;
		this.name = Name;
	}

	public Song(String name, String path){
		this.name = name;
		this.path = path;
		this.bip = path;
		final JFXPanel fxP = new JFXPanel(); ;
		this.hit = new Media(new File(bip).toURI().toString());
		this.mediaPlayer = new MediaPlayer(hit);
	}

	public  MediaPlayer MediaPlayer() {
		final JFXPanel fxP = new JFXPanel(); 
		Media hit = new Media(new File(this.path).toURI().toString());

		return new MediaPlayer(hit);
	}
	 

	public void Play() {

		if(mediaPlayer==null) {
			//mediaPlayer = MediaPlayer();
			mediaPlayer.play();
			System.out.println(mediaPlayer.getTotalDuration());	
		
		}

		else 	{


			mediaPlayer.play();
			System.out.println("This is coming from the second if statement");	
			System.out.println(mediaPlayer.getTotalDuration());
		}
		
	}
	public void Stop() {
		if(mediaPlayer != null)
			mediaPlayer.stop();
	}


	public void Pause() {
		if(mediaPlayer != null)
			mediaPlayer.pause();
		//mediaPlayer.p
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Playlist getAlbum() {
		return Album;
	}
	public void setAlbum(Playlist playlist) {
		Album = playlist;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
