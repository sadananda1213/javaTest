package arrayPractice;

public class SortAscendingOrder {

	public static void main(String[] args) 
	{
		int arr[]=new int[]{4,9,3,5,6,1};
		int temp=0;
		//Displaying original Array
		System.out.println("Elements of original Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
        //Sort the array in ascending order  
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
        //Displaying elements of array after sorting  
		System.out.println("Elements of array in Ascendng order:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}


	}

}
