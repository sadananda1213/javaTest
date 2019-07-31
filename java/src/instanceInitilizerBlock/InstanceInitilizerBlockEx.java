package instanceInitilizerBlock;
class Bike6
{
	int speed;
	Bike6()
	{
		System.out.println("Speed is:"+speed);
	}
	{
		speed=100;
	}
}

public class InstanceInitilizerBlockEx 
{

	public static void main(String[] args)
	{
		Bike6 b=new Bike6();
		Bike6 b1=new Bike6();
	}

}
//The simple example of instance initializer block that performs initialization.
