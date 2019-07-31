package interface1;
abstract class Shape
{
	abstract void draw();
}
class Rectangle7 extends Shape
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
class Circle2 extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}

public class AbstractionTest 
{

	public static void main(String[] args) 
	{
		Shape s=new Circle2();
		s.draw();

	}

}
