package stringClass;

public class SmallestNBiggestPalindrome 
{
	public static boolean isPalindrome(String a)
	{
		boolean flag=true;
		for(int i=0;i<a.length()/2;i++)
		{
			if(a.charAt(i)!=a.charAt(a.length()-i-1))
			{
				flag=false;
				break;
			}
					
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		String str="Wow you own Kayak";
		String word="",smallPalin="",bigPalin="";
		String words[]=new String[100];
		int temp=0,count=0;
		
	    str=str.toLowerCase();
	    
	    str=str+"";
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)!=' ')
	    	{
	    		word=word+str.charAt(i);
	    	}
	    	else
	    	{
	    		words[temp]=word;
	    		temp++;
	    		word="";
	    		
	    	}
	    }
	    
		
	}

}
