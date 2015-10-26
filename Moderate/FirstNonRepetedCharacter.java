import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FirstNonRepetedCharacter {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            for(int i=0;i<line.length();i++){
            	int j=0;
            	for(j=0;j<line.length();j++){
            		if(line.charAt(i)==line.charAt(j) && i!=j){
            			break;
            		}
            	}
            	if(j>=line.length()){
            		System.out.println(line.charAt(i));
            		break;
            	}
            }
        }
    }
}
