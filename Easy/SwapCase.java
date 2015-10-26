import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SwapCase {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line=line.trim();
            String result="";
            for(int i=0;i<line.length();i++){
            	int val = line.charAt(i);
            	if(val>=65 && val<=90) {
            		result=result+(char)(val+32);
            	} else if(val>=97 && val<=122) {
            		result=result+(char)(val-32);
            	} else {
            		result=result+(char)val;
            	}
            }
            System.out.println(result);
        }
    }
}
