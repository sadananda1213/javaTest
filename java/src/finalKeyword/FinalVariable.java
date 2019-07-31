package finalKeyword;

class Bike7
{
	final int speedLimit=100;
	void run()
	{
		//speedLimit=200;
	}
}

public class FinalVariable 
{

	public static void main(String[] args)
	{
		Bike7 b=new Bike7();
		b.run();

	}

}
//Compile time error
//If you make any variable as final, you cannot change the value of final variable(It will be constant).

