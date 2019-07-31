package runtimePolymorphism;
class Bike12
{
	int speedLimit=90;
}
class Honda12 extends Bike12
{
	int speedLimit=100;
}
public class RuntimePolymorphismWithDataMember 
{

	public static void main(String[] args) 
	{
		Bike12 obj=new Honda12();
		System.out.println(obj.speedLimit);

	}

}
//Rule: Runtime polymorphism can't be achieved by data members.
