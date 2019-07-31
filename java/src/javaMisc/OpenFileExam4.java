package javaMisc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OpenFileExam4 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileReader fr=new FileReader("H:\\Demo\\demofile.txt");
		System.out.println("File Content:");
		int r=0;
		while((r=fr.read())!=-1)
		{
			System.out.print((char)r);
		}

	}

}
