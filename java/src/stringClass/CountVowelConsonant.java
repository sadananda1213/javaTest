package stringClass;

public class CountVowelConsonant 
{

	public static void main(String[] args) 
	{
		int vCount=0,cCount=0;
		String str="This is really a Simple Sentence";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i'  || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vCount++;
			}
			else
			{
				if(str.charAt(i)>='a' && str.charAt(i)<='z')
				{
					cCount++;
				}
			}
		}
		System.out.println("No of vowels:" +vCount);
		System.out.println("No of consonant:" +cCount);


	}

}
