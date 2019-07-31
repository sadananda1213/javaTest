package arrayPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementArray 
{

	public static void main(String[] args) 
	{
		String duplicates[]=new String[]{"JAVA","SPRING","STRUTS","JAVA"};
		Set nonDuplicatesSet=new HashSet<>();
		Set duplicatesSet=new HashSet<>();
		for(String str:duplicates)
		{
			if(!nonDuplicatesSet.contains(str))
			{
				nonDuplicatesSet.add(str);
			}
			else
			{
				duplicatesSet.add(str);
			}
		}
           System.out.println(duplicatesSet);
	}

}
 