import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RollerCoster {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String result="";
        	boolean toUpper=true;
            for(int i=0;i<line.length();i++){
            	char val= line.charAt(i);
            	if((val>=65 && val<=90)||(val>=97 && val<=122)){
            		if(toUpper){
            			result+=String.valueOf(val).toUpperCase();
            			toUpper=false;
            		}else{
            			result+=String.valueOf(val).toLowerCase();
            			toUpper=true;
            		}
            	} else {
            		result+=String.valueOf(val);
            	}
            }
            System.out.println(result);
        }
    }
}
