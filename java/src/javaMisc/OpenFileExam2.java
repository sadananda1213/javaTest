package javaMisc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class OpenFileExam2 {

	public static void main(String[] args) throws IOException
	{
		File file=new File("H:\\Demo\\demofile.txt");
		FileInputStream fis=new FileInputStream(file);
		System.out.println("File content:");
		int r=0;
		while((r=fis.read())!=-1)
		{
			
			System.out.print((char)r);
		}

	}

}
