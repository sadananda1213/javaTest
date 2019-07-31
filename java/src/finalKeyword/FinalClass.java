package finalKeyword;
final class Bike9
{
	void run()
	{
		System.out.println("Running safely");
	}
}
/*class Honda9 extends Bike9 //The type Honda9 cannot subclass the final class Bike9
{
	void run()
	{
		System.out.println("Running safely with 100kmph");
	}
}
public class FinalClass 
{

	public static void main(String[] args) {
		Honda9 h=new Honda9();
		h.run();

	}

}*/
//Compile time error
//If you make any class as final, you cannot extend it.

