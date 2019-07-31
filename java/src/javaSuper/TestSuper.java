package javaSuper;

class Animal6
{
	Animal6()
	{
		System.out.println("Animal is created");
	}
}
class Dog6 extends Animal6
{
	Dog6()
	{
		System.out.println("Dog is created");
	}
}
public class TestSuper 
{

	public static void main(String[] args) 
	{
		Dog6 d2=new Dog6();

	}

}
//Another example of super keyword where super() is provided by the compiler implicitly.

