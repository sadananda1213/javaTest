package javaMisc;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileOpenExam3 {

	public static void main(String[] args) throws IOException 
	{
		File file=new File("H:\\Demo\\demofile.txt");
		if(!Desktop.isDesktopSupported())
		{
			System.out.println("Not Supported");
			return;
		}
		Desktop desktop=Desktop.getDesktop();
		if(file.exists())
		{
			desktop.open(file);
		}
		
		

		
	}

}
