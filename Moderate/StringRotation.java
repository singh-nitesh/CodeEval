import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StringRotation {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String original = line.split(",")[0];
            String modified = line.split(",")[1];
            boolean result = false;
            for(int i=0;i<original.length();i++){
            	original = original.charAt(original.length()-1)+original.substring(0,original.length()-1);
            	if(modified.equalsIgnoreCase(original)){
            		result=true;
            		break;
            	}
            }
            System.out.println(result?"True":"False");
        }
    }
}
