package interface1;
interface drawable6
{
	void draw();
	static int cube(int x)
	{
		return x*x*x;
	}
}

class Rectangle6 implements drawable6
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class StaticInterface
{

	public static void main(String[] args) 
	{
		drawable6 d=new Rectangle6();
		d.draw();
		System.out.println(drawable6.cube(3));
	}

}
