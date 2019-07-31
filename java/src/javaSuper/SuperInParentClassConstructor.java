package javaSuper;
class Animal4
{
	Animal4()
	{
		System.out.println("Animal is created");
	}
}
class Dog4 extends Animal4
{
	Dog4 ()
	{
		super();
		System.out.println("Dog is created");

	}
}
public class SuperInParentClassConstructor 
{

	public static void main(String[] args) 
	{

		Dog4 d1=new Dog4();
	}

}
//Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
