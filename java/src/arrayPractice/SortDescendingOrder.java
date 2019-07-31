package arrayPractice;

public class SortDescendingOrder {

	public static void main(String[] args) 
	{
		int arr[]=new int[]{5,6,8,4,9,2,3,1};
		int temp=0;
		//Displaying the original array
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
        //Sort the array in descending order  
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
        //Displaying elements of array after sorting  
		System.out.println("Elements of array sorted in discending order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}


	}

}
