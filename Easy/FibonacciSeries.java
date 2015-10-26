import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FibonacciSeries {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\fff.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			int num = Integer.parseInt(line);
			int fiba=0;
			int fibb=0;
			int fibsum=0;
			for(int i=0;i<=num;i++){
				if(i==0){
					fibsum=0;
					continue;
				} else if(i==1) {
					fibsum=1;
					continue;
				} else {
					fiba=fibb;
					fibb=fibsum;
				}
				fibsum=fiba+fibb;
			}
			
			System.out.println(fibsum);
		}
	}

}
