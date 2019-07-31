package instanceInitilizerBlock;
//What is invoked first, instance initializer block or constructor?

class Bike5
{
	Bike5()
	{
		System.out.println("Constructor is invoked");
	}
	{
		System.out.println("Instance initilizer block invoked");
	}
}

public class InstanceInitilizerBlockEx1 
{

	public static void main(String[] args)
	{
		Bike5 b=new Bike5();
		Bike5 b2=new Bike5();

	}

}
//In this Example,it seems that instance initializer block is firstly invoked 
//but NO. Instance intializer block is invoked at the time of object creation.
//Note: The java compiler copies the code of instance initializer block in every constructor.

