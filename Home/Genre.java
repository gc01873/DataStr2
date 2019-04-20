package Home;

public class Genre {
	public String Type;
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Playlist Category = new Playlist(Type + " Categories ");
	int numOfArtistSongs = Category.getNumOfSongs();

	public void addGenre() {
		Playlist Lib = new Playlist(Type + " Library ");
		String str1 = null;
		str1.equalsIgnoreCase(this.getType()) ;
		for(Song NowPlaying :Lib.getListOfSongs()) {
			
			if(NowPlaying.getGenre()==str1) {
				Category.AddSong(NowPlaying);
			}
		}
	}
}
