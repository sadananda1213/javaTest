package instanceInitilizerBlock;

class A2
{
	A2()
	{
		System.out.println("Parent class constructor invoked");
	}
}
class B2 extends A2
{
	B2()
	{
		super();
		System.out.println("Child class constructor invoked");
	}
	B2(int a)
	{
		super();
		System.out.println("Child class constructor invoked " +a);
	}
	{
		System.out.println("instance initilizer block invoked");
	}
}

public class InstanceInitilizerBlockAfterSuper2 
{

	public static void main(String[] args)
	{
		B2 b1=new B2();
		B2 b2=new B2(10);

	}

}
