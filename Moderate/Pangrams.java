import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Pangrams {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\bbb.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String result="";
        	line=line.toLowerCase();
        	for(int i=97;i<=122;i++){
        		String val=String.valueOf((char)i);
        		if(!line.contains(val)){
        			result+=val;
        		}
        	}
            System.out.println(result.length()>0?result:"NULL");
        }
    }
}
