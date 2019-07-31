//If you don't use any modifier, it is treated as default bydefault. The default modifier is accessible only within package.


package accessModifier;

 class A 
{
	void msg()
	{
		System.out.println("Hello access Modifier");
	}

}
//In the above example, the scope of class A and its method msg() is default so it cannot be accessed from outside the package.
