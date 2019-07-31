package polymorphism;
class Adder2
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b)
	{
		return a+b;
	}
}

public class TestOverloading2 
{

	public static void main(String[] args)
	{
		System.out.println(Adder2.add(15, 15));
		System.out.println(Adder2.add(10.5, 10.7));
		
	}

}
