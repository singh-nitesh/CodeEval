import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LostInTransalation {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String decode = "yhesocvxduiglbkrztnwjpfmaq";
        while ((line = buffer.readLine()) != null) {
        	String result="";
            for(int i=0;i<line.length();i++){
            	char val= line.charAt(i);
            	if(val>=97 && val<=122){
            		val = decode.charAt(val-97);
            	}
            	result+=val;
            }
            System.out.println(result);
        }
    }
	
	
}
