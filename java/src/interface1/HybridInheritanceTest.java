package interface1;
class A2
{
	void m1()
	{
		System.out.println("This m1 method for A2 class");
	}
}
interface B2
{
	void m2();
}
interface B3
{
	void m3();
}

public class HybridInheritanceTest extends A2 implements B2,B3
{
	public void m2()
	{
		System.out.println("This is m2 method for B2 interface");
	}
	public void m3()
	{
		System.out.println("This is m3 method for B3 interface");
	}

	public static void main(String[] args) 
	{
		HybridInheritanceTest mi=new HybridInheritanceTest();
		mi.m1();
		mi.m2();
		mi.m3();

	}

}
