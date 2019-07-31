package javapractice;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no whose factorial you want");
		int x=sc.nextInt();
		int f=1;
		for(int i=x;i>0;i--)
		{
			f=f*i;
		}
		System.out.println("Factorial of the no is:"+f);

	}

}
