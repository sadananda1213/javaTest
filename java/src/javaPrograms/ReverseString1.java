package javaPrograms;

public class ReverseString1 {

	public static void main(String[] args)
	{
		String s="Sadananda";
		String reverse=new StringBuffer(s).reverse().toString();
		System.out.println("String before reverse:"+s);
		System.out.println("String after reverse:"+reverse);

	}

}
