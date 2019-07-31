package arrayPractice;

public class EvenPosition {

	public static void main(String[] args) 
	{
		int arr[]=new int []{1,4,6,8,9,7};
		System.out.println("Element present in even position:");
        //Loop through the array by incrementing value of i by 2  
        //Here, i will start from 1 as first even positioned element is present at position 1. 
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]+ " ");
		}



	}

}
