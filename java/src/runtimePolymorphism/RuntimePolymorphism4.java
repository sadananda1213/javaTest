package runtimePolymorphism;
class Animal5
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog5 extends Animal5
{
	void eat()
	{
		System.out.println(" Dog Eating braed...");
	}
}
class Cat5 extends Animal5
{
	void eat()
	{
		System.out.println(" Cat Eating rat...");
	}
}
class Lion5 extends Animal5
{
	void eat()
	{
		System.out.println(" Lion Eating meat...");
	}
}
public class RuntimePolymorphism4 
{

	public static void main(String[] args) 
	{
		Animal5 a;
		a=new Dog5();
		a.eat();
		a=new Cat5();
		a.eat();
		a=new Lion5();
		a.eat();

	}

}
