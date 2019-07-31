package stringClass;

public class RemoveWhiteSpace 
{

	public static void main(String[] args) 
	{
		String str1="Remove white space";
		str1=str1.replaceAll("\\s+","");
		System.out.println("String after removing white spaces:"+str1);

	}

}
