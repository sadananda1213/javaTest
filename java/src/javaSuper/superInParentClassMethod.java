//The super keyword can also be used to invoke parent class method. 
//It should be used if subclass contains the same method as parent class.
//In other words, it is used if method is overridden.

package javaSuper;
class Animal1
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog1 extends Animal1
{
	void eat()
	{
		System.out.println("Eating bread");
	}
	void bark()
	{
		System.out.println("Barking");
	}
	void work()
	{
		super.eat();
		bark();
	}
}
public class superInParentClassMethod 
{

	public static void main(String[] args) 
	{
		Dog1 d=new Dog1();
		d.work();


	}

}
//In the above example Animal and Dog both classes have eat() method if we call eat() method from Dog class, it will call the eat() method of Dog class by default because priority is given to local.
//To call the parent class method, we need to use super keyword.


