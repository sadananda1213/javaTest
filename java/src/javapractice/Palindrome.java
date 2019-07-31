package javapractice;

public class Palindrome {

	public static void main(String[] args) 
	{
		
		int no=121;
		int sum=0;
		int copy=no;
		while(no>0)
		{
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		//System.out.println(sum+": is the Palindrome");
		if(sum==copy)
		{
			System.out.println(copy+":is the Palindrome");
		}
		else
		{
			System.out.println(copy+":is not Palindrome");
		}
	}

}
