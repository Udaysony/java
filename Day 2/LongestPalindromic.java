
public class LongestPalindromic {
	
	
	public static void main(String[] args) {

		String str = "abcbab";
		
		int start = 0;
		int ct = 0;
		
		for(int i=0;i<str.length();i++)
		{
			for (int j = i; j < str.length(); j++) {
	            int flag = 1;

	            for (int k = 0; k < (j - i + 1) / 2; k++)
	                if (str.charAt(i + k) != str.charAt(j - k))
	                    flag = 0;
	 
	            if (flag!=0 && (j - i + 1) > ct) {
	                start = i;
	                ct = j - i + 1;
	            }
	        }
		}
		
		System.out.println(str.substring(start,start+ct));
		
		
	}

}
