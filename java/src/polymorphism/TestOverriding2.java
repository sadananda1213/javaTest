package polymorphism;
class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
class Axix extends Bank
{
	int getRateOfInterest()
	{
		return 10;
	}
}
public class TestOverriding2
{

	public static void main(String[] args)
	{
		SBI s=new SBI();
		ICICI i=new ICICI();
		Axix a=new Axix();
		System.out.println("SBI rate of interest is:"+s.getRateOfInterest());
		System.out.println("ICICI rate of interest is:"+i.getRateOfInterest());
		System.out.println("Axix rate of interest is:"+a.getRateOfInterest());

	}

}
