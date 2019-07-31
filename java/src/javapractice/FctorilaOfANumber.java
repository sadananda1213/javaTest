package javapractice;

public class FctorilaOfANumber 
{

	public static void main(String[] args)
	{
		int no=5;
		int fact=1;
		/*while(no>0)
		{
			fact=fact*no;
			no=no-1;
		}
		System.out.println("Factorial of the number is:"+fact);
		*/
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
