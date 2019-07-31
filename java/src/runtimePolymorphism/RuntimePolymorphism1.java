package runtimePolymorphism;
class Bike6
{
	void run()
	{
		System.out.println("Running");
	}
}
class Splendor extends Bike6
{
	void run()
	{
		System.out.println("Running safely with 60klmph");
	}
}
public class RuntimePolymorphism1 
{

	public static void main(String[] args)
	{
		Bike6 b=new Splendor(); //upcasting
		b.run();

	}

}
