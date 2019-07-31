package javapractice;

public class SwappingWithout3rdVariable 
{

	public static void main(String[] args) 
	{
		int x=20;
		int y=10;
		System.out.println("value of x Before Swapping:"+x);
		System.out.println("value of y Before Swapping:"+y);


		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x After Swapping:"+x);
		System.out.println("value of y After Swapping:"+y);

	}

}
