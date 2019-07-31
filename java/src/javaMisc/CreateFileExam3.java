package javaMisc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileExam3 {

	public static void main(String[] args) throws IOException {

		Path path=Paths.get("H:\\Demo\\javaProgram.txt");
		Path p=Files.createFile(path);
		System.out.println("File Created at:"+p);
	}

}
