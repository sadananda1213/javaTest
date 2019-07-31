package runtimePolymorphism;
class Animal13
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog13 extends Animal13
{
	void eat()
	{
		System.out.println("Dog eating bread..");
	}
}
class BabyDog2 extends Dog13
{
	
}
public class RuntimePolymorphismWithMultilevelInheritance2 
{

	public static void main(String[] args) 
	{
		Animal13 a=new BabyDog2();
		a.eat();
		
	}

}
//Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.


