import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class BitPositions {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\ddd.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			int n = Integer.parseInt(line.split(",")[0]);
			int p1 = Integer.parseInt(line.split(",")[1]);
			int p2 = Integer.parseInt(line.split(",")[2]);
			if(getBit(n,p1)==getBit(n,p2)){
				System.out.println("true");
			} else{
				System.out.println("false");
			}
		}
	}
	public static byte getBit(int value,int position){
		return (byte)((value >> position-1) & 1);
	}
}
