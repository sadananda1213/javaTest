//If you make any class constructor private, you cannot create the instance of that class from outside the class. For example:

package accessModifier;
class A2
{
	private A2()
	{
		System.out.println("Private constructor");
	}
	void msg()
	{
		System.out.println("Hello PrivateAccessModifier");
	}
}

public class PrivateAccessModifier2 
{

	public static void main(String[] args) 
	{
		//A a=new A(); //compile time error

	}

}

//Note: A class cannot be private or protected except nested class.
