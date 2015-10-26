import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MthToLastElement {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            int val = Integer.valueOf(input[input.length-1]);
            if(val<input.length)
            	System.out.println(input[(input.length-val)-1]);
        }
    }
}
