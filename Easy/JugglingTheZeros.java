import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JugglingTheZeros {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            String bin="";
            for(int i=0;i<input.length;i+=2){
            	if(input[i].equals("0")){
            		for(int j=0;j<input[i+1].length();j++){
            			bin+="0";
            		}
            	}else{
            		for(int j=0;j<input[i+1].length();j++){
            			bin+="1";
            		}
            	}
            }
            System.out.println(Long.parseLong(bin, 2));
        }
    }
}
