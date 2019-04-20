package Home;

import java.io.Serializable;
import java.util.HashMap;

import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Itunes implements Serializable {
Song CurrentlyPlaying ;
	MediaPlayer ItunesPlayer = new MediaPlayer(CurrentlyPlaying.getHit());
	MediaView Viewer = new MediaView (ItunesPlayer);
	Playlist Library = new Playlist("Music Library");
	HashMap<String,Album> AlbumMap = new HashMap<String, Album>();
	
	
	HashMap<String,Artist> ArtistMap = new HashMap<String, Artist>();
	
	
	HashMap<String,Genre> GenreMap = new HashMap<String, Genre>();
	
	public Album addAlbum(Album x) {
		if(AlbumMap.containsValue(x)) {
			System.out.println("Album has already been added!");
			
		return x;
		}
		else
		
	 AlbumMap.put(x.getAlbumName().toLowerCase(), x);
	 
	 return x;
	}
	
	public void removeAlbum(Album x) {
		if(AlbumMap.isEmpty()) {
			System.out.println("Cannot remove what is not there young padawan");
		}
		if(!AlbumMap.containsKey(x.getAlbumName().toLowerCase())) {
			System.out.println("There does not seem to be a key by that link");
		}
		if(AlbumMap.containsKey(x.getAlbumName().toLowerCase())) {
			AlbumMap.remove((x.getAlbumName().toLowerCase()));
		}
	}
	
	public Artist addArtist(Artist x) {
		if(AlbumMap.containsValue(x)) {
			System.out.println("Artist has already been added!");
			
		return x;
		}
		else
		
	 ArtistMap.put(x.getName().toLowerCase(), x);
	 
	 return x;
	}
	
	public void removeAlbum(Artist x) {
		if(ArtistMap.isEmpty()) {
			System.out.println("Cannot remove what is not there young padawan");
		}
		if(!ArtistMap.containsKey(x.getName().toLowerCase())) {
			System.out.println("There does not seem to be a key by that link");
		}
		if(ArtistMap.containsKey(x.getName().toLowerCase())) {
			AlbumMap.remove((x.getName().toLowerCase()));
		}
		
		
	}
}
