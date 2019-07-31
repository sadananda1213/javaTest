package runtimePolymorphism;
class Animal10
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog10 extends Animal10
{
	void eat()
	{
		System.out.println("Dog eating Bread...");
	}
}
class BabyDog extends Dog10
{
	void eat()
	{
		System.out.println("BabyDog eating Milk...");
	}
}
public class RuntimePolymorphismWithMultilevelInheritance 
{

	public static void main(String[] args)
	{
		Animal10 a1,a2,a3;
		a1=new Animal10();
		a1.eat();
		a2=new Dog10();
		a2.eat();
		a3=new BabyDog();
		a3.eat();

	}

}
