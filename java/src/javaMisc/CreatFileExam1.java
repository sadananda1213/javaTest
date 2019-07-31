package javaMisc;

import java.io.File;
import java.io.IOException;

public class CreatFileExam1 {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("H:\\Demo\\file.txt");
		boolean result;
		result=f.createNewFile();
		if(result)
		{
			System.out.println("File created "+f.getCanonicalPath());
		}
		else
		{
			System.out.println("File alread exiton"+f.getCanonicalPath());
		}

	}

}
