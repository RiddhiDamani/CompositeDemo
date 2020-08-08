
public class FileSystemFactory {
	
	public static IFileSystemItem getFileSystem() {
		Folder root = new Folder("root");
		Folder folder1 = new Folder("folder1");
		Folder folder2 = new Folder("folder2");
		
		File file1 = new File(53, "file1");
		File file2 = new File(94, "file2");
		File file3 = new File(82, "file3");
		
		root.addChild(folder1);
		root.addChild(file3);
		folder1.addChild(folder2);
		folder1.addChild(file2);
		folder2.addChild(file1);
		
		return root;

	}
}	
