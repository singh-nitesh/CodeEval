import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class BatsChallenge {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            int l=Integer.parseInt(input[0])-12;
            int d=Integer.parseInt(input[1]);
            int n=Integer.parseInt(input[2]);
            int i=1;
            int j=0;
            int count =0;
            while(l>i){
            	
            }
            
        }
    }
}
