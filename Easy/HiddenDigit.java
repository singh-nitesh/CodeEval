import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class HiddenDigit {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String result="";
            for(int i=0;i<line.length();i++){
            	char input= line.charAt(i);
            	if(input>=97 && input<=106){
            		result+=(char)(input-49);
            	} else if(input>=48 && input<=57){
            		result+=input;
            	}
            }
            if(result.length()<1){
            	System.out.println("NONE");
            } else {
            	System.out.println(result);
            }
        }
    }
}
