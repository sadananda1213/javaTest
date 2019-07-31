package finalKeyword;
class A9
{
	static final int data; //Static final variable
	static
	{
		data=50;
	}
}

public class InitilizeStaticFinalVarible 
{

	public static void main(String[] args) 
	{
		System.out.println(A9.data);

	}

}
//A static final variable that is not initialized at the time of declaration is known as static blank final variable. 
//It can be initialized only in static block.

