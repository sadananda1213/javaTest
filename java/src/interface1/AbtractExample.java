package interface1;
abstract class Bike
{
	abstract void run();
}
class Honda extends Bike
{
	public void run()
	{
		System.out.println("running safely");
	}
}
public class AbtractExample 
{

	public static void main(String[] args)
	{
		Bike b=new Honda();
		b.run();

	}

}
