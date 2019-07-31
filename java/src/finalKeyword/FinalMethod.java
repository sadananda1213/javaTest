package finalKeyword;

class Bike8
{
	final void run()
	{
		System.out.println("Running");
	}
}
class Honda8 extends Bike8
{
	//void run()
	{
		System.out.println("Running safely");
	}
}
public class FinalMethod 
{

	public static void main(String[] args) 
	{
		Honda8 h=new Honda8();
		h.run();

	}

}
//Compile time error
//If you make any method as final, you cannot override it.

