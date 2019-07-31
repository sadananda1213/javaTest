package stringClass;

public class ChangeCase 
{

	public static void main(String[] args) 
	{
		String str="Great Power";
		StringBuffer str1=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			//Checks for lower case character  
			if(Character.isLowerCase(str.charAt(i)))
			{
				//Convert it into upper case using toUpperCase() function  
				str1.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			//Checks for upper case character
			else if(Character.isUpperCase(str.charAt(i)))
			{
				//Convert it into upper case using toLowerCase() function  
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));

			}
		}
		System.out.println("String after case change:"+str1);
	}

}
