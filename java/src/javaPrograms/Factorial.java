package javaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int val=sc.nextInt();
		int fact=1;
		
			if(val==0)
			{
				fact=1;
			}
			else
			{
				for(int i=val;i>0;i--)
				{
					fact=fact*i;
					System.out.println("Factorial of the number is:"+fact);
				}
			}
		

	}

}
