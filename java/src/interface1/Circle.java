package interface1;
interface drawable
{
	void draw();
}
class Rectangle implements drawable
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

public class Circle implements drawable
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}

	public static void main(String[] args)
	{
		drawable d=new Circle();
		d.draw();
		drawable d1=new Rectangle();
		d1.draw();

	}

}
