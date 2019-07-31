
// Can we initialize blank final variable?

package finalKeyword;
class Bike11
{
	final int speedLimit;  //Blank final variable
	Bike11()
	{
		speedLimit=40;
		System.out.println(speedLimit);
	}
}
public class InitilzeBlanlFinalVariale 
{

	public static void main(String[] args) 
	{
		new Bike11();
	}

}
//Yes, but only in constructor. For example:

