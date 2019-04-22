package Home;

import java.io.File;
import java.io.IOException;


public class TestClass  {

	public static void main(String[] args)  throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
		//private static final long serialVersionUID = 1L;
		Album First = new Album("First");
		//First.AddSong("DubStep", "Teh 15 second dubstep bro..mp3");
		First.AddSong("Sunflower", "SunFlower.mp3");
		//System.out.println(First.getListOfSongs().get(0).getPath());

		First.AddSong("Robbery", "Juice WRLD - Robbery (Lyrics).mp3");
		
		System.out.println(First.getNumOfSongs());
		/*First.Start();
		File currentDirFile = new File(".");
		String helper = currentDirFile.getAbsolutePath();
		String currentDir = helper.substring(0, helper.length() - currentDirFile.getCanonicalPath().length());*/
	}

}
