
public class SongListGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SongComponent industrialMusic = new SongGroup("Industrial", "is a style of experimental music that draws on transgressive");
	    SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "is a genre of rock that developed in the late 1960s, largely");
	    SongComponent dubStepMusic = new SongGroup("Dubstep", "is a genre of electronic dance music that originated in South");
	    
	    SongComponent everySong = new SongGroup("Song List", "Every Song available");
	    everySong.add(industrialMusic);
	    
	    industrialMusic.add(new Song("Head Like a hole", "NIN", 1990));
	    industrialMusic.add(new Song("HeaadHunter", "Front 242", 1988));
	    industrialMusic.add(dubStepMusic);
	    
	    dubStepMusic.add(new Song("Centipede", "Knife Party", 2012));
	    dubStepMusic.add(new Song("Tetris", "Doctor P", 2011));
	    
	    everySong.add(heavyMetalMusic);
	    heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
	    heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

	    DiscJockey crazyLarry = new DiscJockey(everySong);
	    crazyLarry.getSongList();


	
	}

}
