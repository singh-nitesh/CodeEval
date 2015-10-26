import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class WithoutRepetition {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String result="";
        	char prevVal=0;
        	for(int i=0;i<line.length();i++){
        		char val=line.charAt(i);
        		if(prevVal==0 || prevVal!=val)
        			result+=val;
        		prevVal=val;
        	}
        	System.out.println(result);
        }
    }
}
