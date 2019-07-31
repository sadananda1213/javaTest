package javaMisc;

import java.io.File;
import java.io.IOException;

public class FileDeleteExam2 {

	public static void main(String[] args) throws IOException  {

		File temp;
		temp=File.createTempFile("abs",".temp");
		System.out.println("Temp file created at location:"+temp.getAbsolutePath());
		temp.deleteOnExit();
		System.out.println("Temp File exit:"+temp.exists());
		
	}

}
