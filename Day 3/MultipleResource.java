import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream input = new FileInputStream("test1.txt");
		    BufferedInputStream bufferedInput = new BufferedInputStream(input))
		{
	       int data = bufferedInput.read();
	       while(data != -1)
	       {
	    	   System.out.print((char) data);
	           data = bufferedInput.read();
	       }
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
