package interface1;
abstract class Bank2
{
	abstract int getRateOfInterest();
}
class SBI2 extends Bank2
{
	public int getRateOfInterest()
	{
		return 7;
	}
}
class PNB2 extends Bank2
{
	public int getRateOfInterest()
	{
		return 8;
	} 
}

public class TestBank 
{

	public static void main(String[] args) 
	{
		Bank2 b;
		b=new SBI2();
		System.out.println("Rate of Interset SBI is:"+b.getRateOfInterest()+"%");
		b=new PNB2();
		System.out.println("Rate of Interset PNB is:"+b.getRateOfInterest()+"%");

	}

}
