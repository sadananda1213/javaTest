package javapractice;

public class HighestNumber 
{

	public static void main(String[] args) 
	{
		int no=26743;
		int hd=0;
		while(no>0)
		{
			int rem=no%10;
			if(rem>hd)
			{
				hd=rem;
			}
			no=no/10;
		}
		System.out.println(hd+ " is the highest number");

	}

}
