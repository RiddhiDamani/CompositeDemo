
public class File implements IFileSystemItem {
	private final int size;
	private final String name;
	 
	File(int size, String name) {
		this.size = size;
		this.name = name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
}
