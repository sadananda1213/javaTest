package interface1;
interface printable3
{
	void print();
}
interface showable3
{
	void print();
}

public class MultipleInheritance3 
{
	public void print()
	{
		System.out.println("Hello Interface");
	}

	public static void main(String[] args) 
	{
		MultipleInheritance3 mi=new MultipleInheritance3();
		mi.print();

	}

}
