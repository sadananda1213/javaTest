package interface1;
interface printable
{
	void print();
	
}

public class CircleInterfaceExample implements printable
{
	public void print()
	{
		System.out.println("Hello Interface");
	}

	public static void main(String[] args)
	{
		CircleInterfaceExample ce=new CircleInterfaceExample();
		ce.print();

	}

}
