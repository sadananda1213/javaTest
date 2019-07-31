package polymorphism;
class A4
{
	A4 get()
	{
		return this;
	}
}
class B4 extends A4
{
	B4 get()
	{
		return this;
	}
	void message()
	{
		System.out.println("Welcome to covariant returntype");
	}
}
public class CovariantReturnTypeEx {

	public static void main(String[] args) {
		new B4().get().message();

	}

}
//As you can see in the above example, the return type of the get() method of A4 class is A4 but the return type of the get() method of B4 class is B4. 
//Both methods have different return type but it is method overriding. This is known as covariant return type.
