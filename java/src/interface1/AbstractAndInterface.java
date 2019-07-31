package interface1;
interface A
{
	void m1();
	void m2();
	void m3();
	void m4();
}
abstract class B implements A
{
	public void m3()
	{
		System.out.println("I am m3");
	}
}
class C extends B
{
	public void m1()
	{
		System.out.println("i am m1");
	}
	public void m2()
	{
		System.out.println("I am m2");
	}
	public void m4()
	{
		System.out.println("I am m4");
	}
}

public class AbstractAndInterface 
{

	public static void main(String[] args) 
	{
		A a=new C();
		a.m1();
		a.m2();
		a.m3();
		a.m4();

	}

}
