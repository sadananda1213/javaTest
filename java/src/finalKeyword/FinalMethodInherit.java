package finalKeyword;
class Bike10
{
	final void run()
	{
		System.out.println("running");
	}
}
class Honda10 extends Bike10
{
	
}
public class FinalMethodInherit 
{

	public static void main(String[] args) 
	{
		new Honda10().run();

	}

}
