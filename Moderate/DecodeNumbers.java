import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DecodeNumbers {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	int result = 1;
            if(line.length()>1){
	            for(int i=1;i<line.length();i++){
	            	int val = Integer.parseInt(String.valueOf(line.charAt(i-1))+String.valueOf(line.charAt(i)));
	            	if(val>10 && val<=26 && val!=20 && val!=10){
	            		result++;
	            	}
	            }
            } else {
            	if(line.charAt(0)=='0'){
            		result=0;
            	}
            }
            System.out.println(result);
        }
    }
}
