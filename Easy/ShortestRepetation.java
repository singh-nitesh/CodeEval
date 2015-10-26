import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ShortestRepetation {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	char val = line.charAt(0);
        	if(line.substring(1).contains(String.valueOf(val))){
        		System.out.println(line.substring(1).indexOf(val)+1);
        	} else {
        		System.out.println(line.length());
        	}
        }
    }
}
