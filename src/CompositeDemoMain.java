
public class CompositeDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Client does not know whether it is working with a file or a folder.
		IFileSystemItem files = FileSystemFactory.getFileSystem();
		System.out.println(files.getSize()); 
	}

}
