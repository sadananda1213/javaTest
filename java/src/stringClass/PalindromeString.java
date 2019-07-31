package stringClass;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the input string");
		Scanner sc=new Scanner(System.in);
		String original=sc.nextLine();
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Given string is Palindrome");
		}
		else
		{
			System.out.println("Given string is not Palindrome");
		}

	}

}
