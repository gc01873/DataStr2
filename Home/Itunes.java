package Home;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.Serializable;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;

public class Itunes implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Song CurrentlyPlaying ;
	//MediaPlayer ItunesPlayer = new MediaPlayer(CurrentlyPlaying.getHit());
	//MediaView Viewer = new MediaView (ItunesPlayer);
	//Playlist Library = new Playlist("Music Library");
	HashMap<String,Album> AlbumMap = new HashMap<String, Album>();


	HashMap<String,Artist> ArtistMap = new HashMap<String, Artist>();
Player play = new Player();


	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		/*Itunes itunes = new Itunes();
		itunes.loadSongs();
		itunes.displayAllSongs();
		serializeContainer(itunes);*/

	//	File file = new File("C:\\Users\\sm06156\\git\\DataStr22\\Home\\Muzic\\");
		Itunes itunes = deserializer();// Why is this dup;icate variable
		playStream(itunes.ArtistMap.get("Bryce Vine").albums.get("Default"));//what key is this/ starter album*/
	}


	public void loadSongs() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C:\\Users\\sm06156\\git\\DataStr22\\songs.txt"));//what should be added here
		while(scan.hasNextLine()){
			String temp1 = scan.nextLine();
			addSongs(temp1);
		}
	}

	//may need to switch input to an album
	public static void playStream(Playlist playlist) throws InterruptedException {
		JFXPanel jxp = new JFXPanel();
		Player.mPlayer = new MediaPlayer(new Media(new File("C:\\Users\\sm06156\\git\\DataStr22\\Home\\Muzic\\" + playlist.getListOfSongs().get(0).getArtist().Name + " - " + 
				playlist.getListOfSongs().get(0).getName() + ".mp3" ).toURI().toString()));//what file should be hereee
		for (int i = 0; i < playlist.getListOfSongs().size();i++ ) {
			System.out.println(playlist.getListOfSongs().get(i).getName());
			while(Player.mPlayer.getStatus().equals(Status.UNKNOWN)) {
				System.out.println("Unknown");
				Thread.sleep(1000);
			}
			if(Player.mPlayer.getStatus().equals(Status.STOPPED)|| Player.mPlayer.getStatus().equals(Status.READY)) {
				System.out.println("Stopped giving new Media");
				Player.mPlayer = new MediaPlayer(new Media(new File("C:\\Users\\sm06156\\git\\DataStr22\\Home\\Muzic\\" + playlist.getListOfSongs().get(i).getArtist().Name + " - " + 
						playlist.getListOfSongs().get(i).getName() + ".mp3").toURI().toString()));
				Thread.sleep(1000);
			} else {
				Player.mPlayer.play();
			}
			Player.mPlayer.setOnReady(new Runnable() {
				public void run(){
					Player.mPlayer.play();
				}
			});
		}
	}
	public void addSongs(String line) {
		String[] p = line.split(" - ");
		if(!ArtistMap.containsKey(p[0])) {
			ArtistMap.put(p[0], new Artist(p[0]));
			ArtistMap.get(p[0]).albums.put("Default", new Album("Default",p[1])) ;
		}

		ArtistMap.get(p[0]).albums.get("Default").getListOfSongs().add(new Song(p[1],ArtistMap.get(p[0]),ArtistMap.get(p[0]).albums.get("Default")));
	}

	public void displayAllSongs() {
		for(Map.Entry<String, Artist>temp:ArtistMap.entrySet()) {
			Artist artistTemp = temp.getValue();
			for(Map.Entry<String, Album> tempAlbum : artistTemp.albums.entrySet()) {
				Album tempAlb = tempAlbum.getValue();
				for(Song s : tempAlb.getListOfSongs()) {
					System.out.println(artistTemp.getName() + " " + tempAlb.AlbumName+ " " + s.getName());
				}
			}
		}
	}

	public static void serializeContainer(Itunes itunes) {
		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\sm06156\\git\\DataStr22\\Home\\Muzic\\output.ser");//
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(itunes);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in ....");

		} catch (IOException i) {
			i.printStackTrace();
		}
	}


	public static Itunes deserializer() {
		Itunes superSerialGuis = null;
		try {
			FileInputStream fileIn = new FileInputStream("C:\\Users\\sm06156\\git\\DataStr22\\Home\\Muzic\\output.ser");//
			System.out.println(fileIn.getFD());
			ObjectInputStream in = new ObjectInputStream(fileIn);
			superSerialGuis = (Itunes) in.readObject();
			in.close();
			fileIn.close();

		} catch (IOException i ) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Oops class not found deserealizer");
			c.printStackTrace();
		}

		return superSerialGuis;
	}
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
		if(ArtistMap.containsValue(x)) {
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
