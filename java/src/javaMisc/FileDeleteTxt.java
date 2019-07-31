package javaMisc;

import java.io.File;

public class FileDeleteTxt {

	public static void main(String[] args) throws InterruptedException {

		File f=new File("H:\\demofile.txt");
		f.deleteOnExit();
		System.out.println("Done");
		Thread.sleep(1000);
	}

}
