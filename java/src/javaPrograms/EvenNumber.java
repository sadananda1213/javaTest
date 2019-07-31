package javaPrograms;

public class EvenNumber {

	public static void main(String[] args) 
	{
		int limit=50;
		System.out.println("Printing even number between 1 to and "+limit);
		for(int i=0;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	
	}

}
