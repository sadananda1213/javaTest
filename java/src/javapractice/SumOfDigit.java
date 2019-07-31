package javapractice;

public class SumOfDigit 
{

	public static void main(String[] args) 
	{
		int no=12456;
		int sum=0;
		/*while(no>0)
		{
			int r=no%10;
			sum=sum+r;
			no=no/10;
		}
		System.out.println(sum);
		*/
		for(int i=1;i<=4;i++)
		{
			int r=no%10;
			sum=sum+r;
			no=no/10;
		}
		System.out.println("sum of the digits are:"+sum);
	}
}
