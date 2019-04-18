
public class Artist {
public String Name;
public Playlist Discography = new Playlist(Name + " Discography ");
int numOfArtistSongs = Discography.getNumOfSongs();


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
