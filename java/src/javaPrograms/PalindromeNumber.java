package javaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int num, rev=0,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String val=sc.next();
		num=Integer.parseInt(val);
		int n=num;
		while(num!=0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(n==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		

	}

}
