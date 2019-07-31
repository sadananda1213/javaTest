package javaPrograms;

import java.util.Scanner;

public class Factorial2 
{
	static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) 
	{
		
		int num;
		String val;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		val=sc.next();
		num=Integer.parseInt(val);
		int result=fact(num);
		System.out.println("Factorial of " +num+ " is "+result);
		
	}

}
