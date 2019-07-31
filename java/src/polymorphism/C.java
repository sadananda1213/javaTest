package polymorphism;
import accessModifier.*;

 class C extends B
{
    public void msg()
    {
    	System.out.println("Hello");
    }
	public static void main(String[] args) 
	{
		C obj=new C();
		obj.msg();
	}	

}
 
 //The protected access modifier is accessible within package and outside the package but through inheritance only.
 //The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.


