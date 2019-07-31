package arrayPractice;

public class RotateRight {

	public static void main(String[] args) 
	{
		int arr[]=new int[]{1,2,3,4,5};
		int n=3;
		//print original array
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//Rotate the given array by n times toward right  
		for(int i=0;i<n;i++)
		{
			int j,last;
			//Stores the last element of array  
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				//Shift element of array by one  
				arr[j]=arr[j-1];

			}
			//Last element of array will be added to the start of array.  
			arr[j]=last;

		}
		System.out.println();
		//Displays resulting array after rotation 
		System.out.println("Array after right rotation");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}

	}

}
