
public class WrapperDemo {
	
	private static void integerWrapperClass(int value, String str) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Convert int to string value:"+Integer.toString(value));
		System.out.println(Integer.valueOf(value));
		
		//rotate the bits on the left side 
		System.out.println(Integer.rotateLeft(value, 3));
		System.out.println("Compare int and Integer value:"+Integer.compare(value, 1));
		System.out.println("Reverse the number:"+Integer.reverse(123));
		System.out.println("Max:"+Integer.max(value, 10));
		
	}
	
	private static void longWrapperClass(long val, String str) {
		// TODO Auto-generated method stub
		Long value = new Long(val);
		System.out.println("Number of leading Zeroes:"+Long.numberOfLeadingZeros(2));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 1;
		String str = "121";
		integerWrapperClass(value,str);

		long val = 2;
		longWrapperClass(val,str);
		//Remaining wrapper classes have almost same methods..
		
	}
}
