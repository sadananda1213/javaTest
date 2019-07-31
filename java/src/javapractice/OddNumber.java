package javapractice;

public class OddNumber 
{

	public static void main(String[] args)
	{
		int no=89456;
		while(no>0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				System.out.println("Print even number:"+rem);
			}
			else
			{
				System.out.println("Print odd number:"+rem);
			}
			no=no/10;
		}

	}

}
