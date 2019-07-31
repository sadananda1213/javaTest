package polymorphism;

public class TypePromotion 
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) 
	{
		TypePromotion tp=new TypePromotion();
		tp.sum(10, 40);
		tp.sum(10, 20, 30);

	}

}
