
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<10;i++)
		{
			for(int k=0;k<10-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

		for(int i=10;i>0;i--)
		{
			for(int k=0;k<10-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

		
	}

}
