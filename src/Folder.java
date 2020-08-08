import java.util.ArrayList;
import java.util.List;

public class Folder implements IFileSystemItem { 
	private final String name;
	private final List<IFileSystemItem> children;
	
	Folder(String name) {
		children = new ArrayList<>();
		this.name = name;
	}
	
	public void addChild(IFileSystemItem fileSystemItem) {
		children.add(fileSystemItem);
	}

	@Override
	public int getSize() {
		int size = 0;
		for(IFileSystemItem child: children) {
			size += child.getSize();
		}
		return size;
	}

}
