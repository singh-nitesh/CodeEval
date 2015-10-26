import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MultipleOfNumbers {
	 public static void main (String[] args) throws IOException {
	        File file = new File("c:\\ccc.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            int x = Integer.parseInt(line.split(",")[0]);
	            int n = Integer.parseInt(line.split(",")[1]);
	            int multiplier = n;
	            while(x>n){
	            	n=n+multiplier;
	            }
	            System.out.println(n);
	        }
	    }
}