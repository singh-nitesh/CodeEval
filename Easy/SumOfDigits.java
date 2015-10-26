import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SumOfDigits {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\eee.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			int num = Integer.parseInt(line);
			int sum=0;
			while(num>0){
				int digit = num%10;
				sum+=digit;
				num=num/10;
			}
			System.out.println(sum);
		}
	}
}
