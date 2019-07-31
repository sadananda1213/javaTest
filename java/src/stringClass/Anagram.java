package stringClass;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args)
	{
		//Define two String
		String str1="Brag";
		String str2="Grab";

		//Convert both the String to Lower case
		str1.toLowerCase();
		str2.toLowerCase();

		//Checking for the length of String
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the Strings are not anagram");
		}
		else
		{
			//Converting the two strings to character Array

			char[]string1=str1.toCharArray();
			char[]string2=str2.toCharArray();

			//Sorting both the array using in-built function sort()

			Arrays.sort(string1);
			Arrays.sort(string2);

			//Comparing both the array using in-built function equals()

			if(Arrays.equals(string1,string2)==true)
			{
				System.out.println("Both the Strings are Anagram");
			}
			else
			{
				System.out.println("Both the Strings are not anagram");
			}

		}

	}

}
