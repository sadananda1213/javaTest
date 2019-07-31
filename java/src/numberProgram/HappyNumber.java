package numberProgram;

public class HappyNumber 
{
    //isHappyNumber() will determine whether a number is happy or not  

	public static int isHappyNumber(int num)
	{
		int rem=0,sum=0;
		//Calculates the sum of squares of digit
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		return sum;
	} 
	public static void main(String[] args) 
	{
		int num=82;
		int result=num;
		while(result!=1 && result!=4)
		{
			result=isHappyNumber(result);
		}
		//Happy Number always ends with 1
		if(result==1)
		{
			System.out.println(num+ " is Happy Number");
		}
		//Unhappy number ends in a cycle of repeating  number which contain 4
		else if(result==4)
		{
			System.out.println(num+ " is Unhappy number");
		}
		
	}

}
