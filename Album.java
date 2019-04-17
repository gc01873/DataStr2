
public class Album extends Playlist {
	
	public Album(String PlayListName) {
		super(PlayListName);
		//ListOfSongs Albums = new ListOfSongs();
		// TODO Auto-generated constructor stub
	}
	String AlbumName = getPlayListName();
	int year; 
	String Artist;

	public String getAlbumName() {
		return AlbumName;
	}
	public void setAlbumName(String albumName) {
		AlbumName = albumName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		Artist = artist;
	}
	
	
	
}
