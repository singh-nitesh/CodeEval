import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TrailingString {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String input = line.split(",")[0];
            String val = line.split(",")[1];
            int count =0;
            while(true){
            	if(input.contains(val)){
            		count++;
            		input = input.substring(0,input.indexOf(val))+input.substring(input.indexOf(val)+val.length());
            	}else {
            		break;
            	}
            }
            System.out.println(count);
        }
    }
}
