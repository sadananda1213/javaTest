package polymorphism;

public class TypePromotion3 
{
	void sum(int a,long b)
	{
		System.out.println("first method invoked");
	}
	void sum(long a,int b)
	{
		System.out.println("Second method invoked");
	}

	public static void main(String[] args) 
	{
		TypePromotion3 tp3=new TypePromotion3();
		//tp3.sum(20, 30);

	}

}
