import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StepWiseWord {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            String longestWord = "";
            for(int i=0;i<input.length;i++){
            	if(longestWord.length()<input[i].length()){
            		longestWord=input[i];
            	}
            }
            String result="";
            for(int i=0;i<longestWord.length();i++){
            	for(int j=0;j<i;j++){
            		result+="*";
            	}
            	result+=longestWord.charAt(i)+" ";
            }
            System.out.println(result.trim());
        }
    }
}
