import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LongestWord {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
           String[] words = line.split(" ");
           String lWord="";
           for(String word : words){
        	   if(lWord.length()<word.length()){
        		   lWord=word;
        	   }
           }
           System.out.println(lWord);
        }
    }
}
