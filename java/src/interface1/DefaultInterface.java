package interface1;
interface drawable5
{
	void draw();
	default void  msg()
	{
		System.out.println("Default interface");
	}
}
class Rectangle5 implements drawable5
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}

public class DefaultInterface 
{

	public static void main(String[] args) 
	{
		drawable5 d=new Rectangle5();
		d.draw(); 
		d.msg();

	}

}
