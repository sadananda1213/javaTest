package accessModifier;
class A1
{
	private int data=40;
	private void msg()
	{
		System.out.println("Hello Private Access Modifier");
	}
}

public class PrivateAccessModifier 
{

	public static void main(String[] args) 
	{
		A a=new A();
		//System.out.println(a.data);//compile time error
		//a.msg();  //compile time error

	}

}
