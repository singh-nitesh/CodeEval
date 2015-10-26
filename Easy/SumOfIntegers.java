import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SumOfIntegers {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\ggg.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int sum=0;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			sum+=Integer.parseInt(line);
		}
		System.out.print(sum);
	}
}
