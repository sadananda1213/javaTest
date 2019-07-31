package arrayPractice;

public class SumOfArray {

	public static void main(String[] args) 
	{
		int arr[]=new int[]{4,5,8,9,11};
		int sum=0;
		//Loop through the array to calculate sum of elements  
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all the element in the Array: "+sum);


	}

}
