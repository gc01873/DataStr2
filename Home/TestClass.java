package Home;

public class TestClass {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Album First = new Album("First");
		//First.AddSong("DubStep", "Teh 15 second dubstep bro..mp3");
		First.AddSong("Sunflower", "SunFlower.mp3");
		//System.out.println(First.getListOfSongs().get(0).getPath());

		First.AddSong("Robbery", "Juice WRLD - Robbery (Lyrics).mp3");
		
		System.out.println(First.getNumOfSongs());
		First.Start();
		
	}

}
