package stringClass;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		String str="sadananda";
	
		removeDuplicates(str);
	}
		static String removeDuplicates(String str)
		{
		    
			Set<Character>s=new HashSet<Character>();
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<str.length();i++)
			{
				Character c=str.charAt(i);
				if(!s.contains(c))
				{
					s.add(c);
					sb.append(c);
				}

			}

			return sb.toString();
		}
}


