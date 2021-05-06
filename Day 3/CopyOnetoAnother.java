import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyOnetoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Write in a file
		try {
			FileWriter file1 = new FileWriter("test1.txt");
			file1.write("Hello World!");
			file1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create another file.

		File file2 = new File("test2.txt");
		try {
			file2.createNewFile();
			System.out.println("Path:"+file2.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Read content from Sample1.txt and write to Sample2.txt
		
		
		try {
			FileReader f1 = new FileReader("test1.txt");
			FileWriter f2 = new FileWriter("test2.txt");
			
			String copy_content = "";
			
			int i;
			while((i=f1.read())!=-1)
			{
				copy_content += (char)i;
			}

			System.out.println("Content in file one:"+copy_content);
			f2.write(copy_content);
			
			f2.close();
			f1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
