package runtimePolymorphism;
class Shape2
{
	void draw()
	{
		System.out.println("Drawing");
	}
}
class Rectangle2 extends Shape2
{
	void draw()
	{
		System.out.println("Drawing Rectangle....");
	}
}
class Circle2 extends Shape2
{
	void draw()
	{
		System.out.println("Drawing Circle.....");
	}
}
class Triangle extends Shape2
{
	void draw()
	{
		System.out.println("Drawing Triangle......");
		
	}
}
public class RuntimePolymorphism3 
{

	public static void main(String[] args) 
	{
		Shape2 s;
		s=new Rectangle2();
		s.draw();
		s=new Circle2();
		s.draw();
		s=new Triangle();
		s.draw();
		

	}

}
