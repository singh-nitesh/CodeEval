import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RemoveCharacters {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String input1 = line.split(", ")[0];
            String input2 = line.split(", ")[1];
            String result="";
            for(int i=0;i<input1.length();i++){
            	int j=0;
            	for(j=0;j<input2.length();j++){
            		if(input1.charAt(i)==input2.charAt(j)){
            			break;
            		}
            	}
            	if(j==input2.length()){
            		result+=input1.charAt(i);
            	}
            }
            System.out.println(result);
        }
    }
}
