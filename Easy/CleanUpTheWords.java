import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CleanUpTheWords {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String result="";
            for(int i=0;i<line.length();i++){
            	char val = line.charAt(i);
            	char prevVal='a';
            	if(i>0){
            		prevVal = line.charAt(i-1);
            	}
            	if((val>=65 && val<=90)||(val>=97 && val<=122)){
            		if(!((prevVal>=65 && prevVal<=90)||(prevVal>=97 && prevVal<=122)))
            			result+=" ";
            		result+=val;
            	}
            }
            System.out.println(result.trim().toLowerCase());
        }
    }
}
