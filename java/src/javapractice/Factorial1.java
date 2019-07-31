package javapractice;

public class Factorial1 
{
	void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of the "+n+" is:"+fact);
	}

	public static void main(String[] args) 
	{
		Factorial1 f=new Factorial1();
		f.fact(5);

	}

}
