import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RightMostChar {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\kkk.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String S=line.trim().split(",")[0];
			char t=line.trim().split(",")[1].charAt(0);
			System.out.println(S.lastIndexOf(t));
		}
	}
}
