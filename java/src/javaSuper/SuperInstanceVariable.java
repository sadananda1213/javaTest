//We can use super keyword to access the data member or field of parent class. 
//It is used if parent class and child class have same fields.
package javaSuper;
class Animal
{
	String color="White";
}
class Dog extends Animal
{
	String color="Black";
	void printColor()
	{
		System.out.println(color);  //print color of Dog class
		System.out.println(super.color); //print color of Animal class
	}
}

public class SuperInstanceVariable 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.printColor();

	}

}

//In the above example, Animal and Dog both classes have a common property color. 
//If we print color property, it will print the color of current class by default. 
//To access the parent property, we need to use super keyword.




