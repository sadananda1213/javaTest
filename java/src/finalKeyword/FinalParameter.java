package finalKeyword;
class Calculation
{
	int cube(final int n)
	{
	//	n=n+2;
		return n*n*n;
	}
}
public class FinalParameter 
{

	public static void main(String[] args) 
	{
		Calculation c=new Calculation();
		c.cube(5);

	}

}
//compile time error
//If you declare any parameter as final, you cannot change the value of it.

