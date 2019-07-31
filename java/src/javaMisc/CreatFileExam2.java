package javaMisc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreatFileExam2 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File name");
		String name=sc.nextLine();
		FileOutputStream fos=new FileOutputStream(name,true);
		System.out.println("Enter File Content");
		String str=sc.nextLine()+"\n";
		byte []b=str.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("File saved");

	}

}
