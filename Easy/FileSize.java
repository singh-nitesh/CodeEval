import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileSize {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\aaa.txt");
		System.out.print(file.length());
	}
}
