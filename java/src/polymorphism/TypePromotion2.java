package polymorphism;

public class TypePromotion2 
{
	void sum(int a,int b)
	{
		System.out.println("int arg method invoked");
	}
	void sum(long a,long b)
	{
		System.out.println("long arg method invoked");
	}

	public static void main(String[] args) 
	{
		TypePromotion2 tp1=new TypePromotion2();
		tp1.sum(10, 20);
		//tp1.sum(40, 50);

	}

}
