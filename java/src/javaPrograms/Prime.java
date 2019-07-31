package javaPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		String val=sc.next();
		int x=Integer.parseInt(val);
		
		System.out.println("Enter the last number");
	    val=sc.next();
		int y=Integer.parseInt(val);
		System.out.println("Printing prime number from " +x+ " to "+y);
		for(int i=x;i<=y;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int number)
	{
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				return false; 
			}
			else
			{
				return true;
			}
		}
		return false;
	}
}


 
