package javaMisc;

import java.io.File;

public class FileDeleteExam {

	public static void main(String[] args)
	{

		File f=new File("H:\\Demo2\\demo3.txt");
		if(f.delete())
		{
			System.out.println(f.getName()+ " delete");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
