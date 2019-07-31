package arrayPractice;

public class SmallestLargest
{

	public static void main(String[] args) 
	{
		int arr[]=new int[]{10,50,100,70,30};
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int number:arr)
		{
			if(number>largest)
			{
				largest=number;
			}
		}
		System.out.println("Largest number in the aarray:"+largest);
		for(int number:arr)
		{
			if(number<smallest)
			{
				smallest=number;
			}
		}
		System.out.println("Smallest number in the array:"+smallest);

	}

}
