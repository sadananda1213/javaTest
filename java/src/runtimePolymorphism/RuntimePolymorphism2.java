package runtimePolymorphism;
class Bank2
{
	float gertRateOfInterest()
	{
		return 0;
	}
}
class SBI2 extends Bank2
{
	float gertRateOfInterest()
	{
		return 8.4f;
	}
}
class ICICI2 extends Bank2
{
	float gertRateOfInterest()
	{
		return 7.4f;
	}
}
class Axix2 extends Bank2
{
	float gertRateOfInterest()
	{
		return 9.7f;
	}
}
public class RuntimePolymorphism2 
{

	public static void main(String[] args) 
	{
		Bank2 b;
		b=new SBI2();
		System.out.println("SBI Rate of interest is:"+b.gertRateOfInterest()+"%");
		b=new ICICI2();
		System.out.println("ICICI Rate of interest is:"+b.gertRateOfInterest()+"%");
		b=new Axix2();
		System.out.println("Axix Rate of interest is:"+b.gertRateOfInterest()+"%");

	}

}
