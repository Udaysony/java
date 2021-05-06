import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcabwertgdabsfsbfsc";
		
		HashSet<Character> map = new HashSet<>();
		
		int start = 0;
		int ct = 0;
		int maxct=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(map.contains(str.charAt(i))) {
				if (ct > maxct) {
					maxct = ct;
				}
				ct = 0;
				start = i;
				map.clear();

			}

			map.add(str.charAt(i));
			ct++;
		}
		
		if(ct>maxct )
			maxct = ct;
		
		System.out.print("The longest substring without repeating is: "+str.substring(start,maxct+start));
		
	}

}
