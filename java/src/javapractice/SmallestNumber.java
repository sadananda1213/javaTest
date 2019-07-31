package javapractice;

public class SmallestNumber 
{

	public static void main(String[] args)
	{
		int no=627438;
		int sd=9;
		while(no>0)
		{
			int rem=no%10;
			if(rem<sd)
			{
				sd=rem;
			}
			no=no/10;
		}
		System.out.println(sd+": is the Smallest number");

	}

}
