package numberProgram;

public class HarshadNumber {

	public static void main(String[] args) 
	{
		int num=156;
		int rem=0,sum=0,n;
		//make a copy of num and store it on variable n
		n=num;
		//Calculate the sum of digit
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		//Check the number whether it is divisible by sum of digits
		if(n%sum==0)
		{
			System.out.println(n+ " is a Harshad Number");
		}
		else
		{
			System.out.println(n+ " is not a Harhad Number");
		}

	}

}
