// This acts as an interface for every Song (Leaf) and SongGroup (Composite) we create

public abstract class SongComponent {
	
	public void add(SongComponent newSongComponent) {
		throw new UnsupportedOperationException();

	}
	
	public void remove(SongComponent newSongComponent) {
		throw new UnsupportedOperationException();
	}
	
	public SongComponent getComponent(int componentIndex) {
		throw new UnsupportedOperationException();
	
	}
	
	public String getSongName() {
		 throw new UnsupportedOperationException();
	}
	
	public String getBandName() {
		throw new UnsupportedOperationException();

	}
	
	public int getReleaseYear() {
		throw new UnsupportedOperationException();
	}
	
	// When this is called by a class object that extends
	// SongComponent it will print out information
	// specific to the Song or SongGroup
	
	public void displaySongInfo() {
		throw new UnsupportedOperationException();
	}
}