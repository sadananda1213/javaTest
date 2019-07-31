package javapractice;

public class StrongNoWthin1000 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<=1000;i++)
		{
			int no=i;
			int sum=0;
			int copy=no;
			while(no>0)
			{
				int rem=no%10;
				int fact=1;
				for(int j=1;j<=rem;j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				no=no/10;
			}
			if(copy==sum)
			{
				System.out.println(copy+" is the Strong Number");
			}
		}

	}

}
