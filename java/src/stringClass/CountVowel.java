package stringClass;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) 
	{
		System.out.println("Enter some String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[]ch=str.toCharArray();
		int count=0;
		for(char c:ch)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			break;
				
			}
		}
		System.out.println("Number of vowels in String="+count);

	}

}
