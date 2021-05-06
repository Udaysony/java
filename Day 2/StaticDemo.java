

public class StaticDemo {
	static int a = 10;
	static
	{
		System.out.println("Static block invoked");
	}
	
	static void StaticMethod()
	{	

		System.out.println("Static method invoked");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 5;
		StaticMethod();
		
		System.out.println(a,b);
		
		
	}

}
