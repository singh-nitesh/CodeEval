import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StringMask {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String input = line.split(" ")[0];
            String mask = line.split(" ")[1];
            String result="";
            for(int i=0;i<mask.length();i++){
            	String val = input.substring(i,i+1);
            	if(mask.charAt(i)=='1'){
            		result+=val.toUpperCase();
            	} else {
            		result+=val.toLowerCase();
            	}
            }
            System.out.println(result);
        }
    }
}
