import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CapatalizeWord {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String[] input = line.trim().split(" ");
        	String result = "";
        	for(int i=0;i<input.length;i++){
        		if(input[i].length()>1)
        			input[i]=input[i].substring(0,1).toUpperCase()+input[i].substring(1);
        		else
        			input[i]=input[i].toUpperCase();
        		result = result+input[i]+" ";
        	}
        	System.out.println(result.trim());
        }
    }
}
