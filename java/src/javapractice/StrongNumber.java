package javapractice;

public class StrongNumber {

	public static void main(String[] args)
	{
		int no=145;
		int sum=0;
		int copy=no;
		while(no>0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println(copy+ " is the Strong number");
		}
		else
		{
			System.out.println(copy+" is not the Strong number");

		}

	}

}
