package interface1;
interface printable1
{
	void print();
}
interface showable
{
	void show();
}

public class MultipleInhertance2  implements printable1,showable
{
	public void print()
	{
		System.out.println("Printable interface");
	}
	public void show()
	{
		System.out.println("Showable interface");
	}

	public static void main(String[] args) 
	{
		MultipleInhertance2 mi=new MultipleInhertance2();
		mi.print();
		mi.show();
	}

}
