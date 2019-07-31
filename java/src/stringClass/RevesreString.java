package stringClass;

import java.util.Scanner;

public class RevesreString 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the input string");
		Scanner sc=new Scanner(System.in);   
		String input=sc.nextLine();
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			reverse=reverse+input.charAt(i);
		}
		System.out.println("Reverse string="+reverse);
		

	}

}
