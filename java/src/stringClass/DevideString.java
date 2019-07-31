package stringClass;

public class DevideString 
{

	public static void main(String[] args) 
	{
		String str="aaaabbbbcccc";
		int len=str.length();
		int n=3;
		int temp=0;
		int chars=len/n;
		String equalsStr[]=new String[n];
		if(len%n !=0)
		{
			System.out.println("Sorry this is not divided into "+ n+ " equal parts");
		}
		else
		{
			for(int i=0;i<len;i=i+chars)
			{
				String part=str.substring(i,i+chars);
				equalsStr[temp]=part;
				temp++;
			}
			System.out.println(n+ "equal parts of the string are:");
			for(int i=0;i<equalsStr.length;i++)
			{
				System.out.println(equalsStr[i]);
			}
		}

	}

}
