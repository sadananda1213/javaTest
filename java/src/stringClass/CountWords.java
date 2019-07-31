package stringClass;

public class CountWords {

	public static void main(String[] args) 
	{
		String str="Beaurt lies in the Eyes of beloved";
		int wordCount=0;
		for(int i=0;i<str.length()-1;i++)
		{
			 //Counts all the spaces present in the string  
            //It doesn't include the first space as it won't be considered as a word  
			if(str.charAt(i)==' ' && Character.isLetter(str.charAt(i+1))&&(i>0))
				wordCount++;

		}
		wordCount++;
		System.out.println("Total numbers of words in the given String are:"+wordCount);

	}

}
