package interface1;
interface printable4
{
	void print();
}
interface showable4 extends printable4
{
	void show();
}

public class InterfaceInheritance  implements showable4
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) 
	{
		InterfaceInheritance ii=new InterfaceInheritance();
		ii.print();
		ii.show();

	}

}
