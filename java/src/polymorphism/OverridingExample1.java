package polymorphism;
class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running ");
	}
}
class Scootor extends Vehicle
{
	void run()
	{
		System.out.println("Bikr is running safely");
	}
}
public class OverridingExample1 
{

	public static void main(String[] args) 
	{
		Scootor b=new Scootor();
		b.run();

	}

}
