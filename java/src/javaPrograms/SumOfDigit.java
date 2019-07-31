package javaPrograms;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) 
	{
		int num,sum=0,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String val=sc.next();
		num=Integer.parseInt(val);
		while(num!=0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;

		}
		System.out.println("Sum of digit is:"+sum);

	}

}
