package interface1;
abstract class Bike3
{
	Bike3()
	{
		System.out.println("Bike is created");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("Gear changed");
	}

}
class Honda3 extends Bike3
{
	public void run()
	{
		System.out.println("Running safely");
	}
}

public class TestAbstraction2 
{

	public static void main(String[] args)
	{
		Bike3 b=new Honda3();
		b.changeGear();
		b.run();

	}

}
