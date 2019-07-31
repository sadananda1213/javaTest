package stringClass;

public class StringPermute 
{
	public static String swapString(String a,int i,int j)
	{
		char[]b=a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		return String.valueOf(b);
	}
	public static void main(String[] args) 
	{
		String str="ABC";
		int len=str.length();
		System.out.println("All the permutation of the String are:");
		generatePermutation(str,0,len);
	}
	//Function for generating different permutation of the string
	public static void generatePermutation(String str,int start,int end)
	{
		// print the permutation
		if(start==end-1)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=start;i<end;i++)
			{
				//Swapping the string by fixing a character
				str=swapString(str,start,i);
				//recursively calling function generatePermutation() for rest of the character
				generatePermutation(str,start+1,end);
				//Backtracking and swapping the character again
				str=swapString(str,start,i);
			}
		}
	}

}
