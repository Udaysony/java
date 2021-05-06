import javax.naming.InvalidNameException;

public class CustomException {

	static void validate(String name) throws InvalidNameException {
		if(name==null)
		{
			throw new InvalidNameException("Name should not be null!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = null;
		try
		{
			validate(name);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
