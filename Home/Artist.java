package Home;

import java.io.Serializable;

public class Artist implements Serializable {
	public String Name;
	public Playlist Discography = new Playlist(Name + " Discography ");
	int numOfArtistSongs = Discography.getNumOfSongs();

	public void addDisco() {
		Playlist Lib = new Playlist(Name + " Library ");
		for(Song NowPlaying :Lib.getListOfSongs()) {
			if(NowPlaying.getArtist()==this.getName()) {
				Discography.AddSong(NowPlaying);
			}
		}
	}
	public Artist(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Playlist getDiscography() {
		return Discography;
	}
	public void setDiscography(Playlist discography) {
		Discography = discography;
	}

}



