package stringClass;

public class CountCharacter2 {

	public static void main(String[] args) 
	{
		String str="Welcome to String class";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=0)
			{
				count++;
			}
		}
		System.out.println("Total no of characters present in the String are:"+count);

	}

}
