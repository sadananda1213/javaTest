package interface1;
interface A1
{
	int a=10;   //by default variables in interface are static and final
	void m1();  //abstract method, by default public
}
public class Test implements A1
{
	public void m1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		/*Test t=new Test();
		t.m1();*/
		A1 a=new Test();
		a.m1();

	}

}
