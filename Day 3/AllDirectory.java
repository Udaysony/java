import java.io.File;

public class AllDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File folders = new File("C:\\");
		
		File[] files = folders.listFiles();
		
		for(File f : files)
		{
			if(f.isFile())
				System.out.println("File name:"+f);
			else
				System.out.println("Folder name:"+f);
		}
	

	}

}
