package javaPrograms;
 
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String val=sc.next();;
		int num=Integer.parseInt(val);
		int rev=0;
		while(num!=0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println("Reverse of the given number is:"+rev);

	}

}
