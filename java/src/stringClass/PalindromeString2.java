package stringClass;

public class PalindromeString2 
{

	public static void main(String[] args) 
	{
		String str="kayak";
		boolean flag=true;
		//Convert the string into lower case
		str=str.toLowerCase();
		  //Iterate the string forward and backward, compare one character at a time   
        //till middle of the string is reached  
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
	}

}
