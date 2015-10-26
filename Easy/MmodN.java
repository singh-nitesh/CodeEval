import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MmodN {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\nnn.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int m = Integer.parseInt(line.trim().split(",")[0]); 
			int n = Integer.parseInt(line.trim().split(",")[1]); 
			while(m>=n){
				m=m-n;
			}
			System.out.println(m);
		}
	}
}
