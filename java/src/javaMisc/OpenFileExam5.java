package javaMisc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class OpenFileExam5 {

	public static void main(String[] args) throws FileNotFoundException
	{
		File f=new File("H:\\Demo\\demofile.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		System.out.println(sc.nextLine());

	}

}
