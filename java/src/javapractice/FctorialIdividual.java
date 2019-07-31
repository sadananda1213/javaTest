package javapractice;

public class FctorialIdividual 
{

	public static void main(String[] args) 
	{
		int n=5462;
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			System.out.println("rem+------->"+fact);
			n=n/10;
		}

	}

}
