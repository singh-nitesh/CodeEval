import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class HexToDecimal {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\ooo.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			System.out.println(Integer.parseInt(line.trim(), 16));
		}
	}

}
