package javaMisc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OpenFile {

	public static void main(String[] args) throws IOException 
	{
		
		File f=new File("H:\\Demo\\demofile.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		System.out.println("File content:");
		int r=0;
		while((r=br.read())!=-1)
        {
        	System.out.print((char)r);
	
        }


	}

}
