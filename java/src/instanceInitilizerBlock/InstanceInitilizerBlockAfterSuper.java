package instanceInitilizerBlock;

class A
{
	A()
	{
		System.out.println("Parent class constructor invked");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Child class constructor invoked");
	}
	{
		System.out.println("Instance initilizer block invoked");
	}
}
public class InstanceInitilizerBlockAfterSuper 
{

	public static void main(String[] args)
	{
		B b=new B();

	}

}
