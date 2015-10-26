import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class NumberOfOnes {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int input = Integer.parseInt(line);
            int count=0;
            for(int i=0;i<32;i++){
            	if(((input>>i) & 1) == 1){
            		count++;
            	}
            }
            System.out.println(count);
        }
    }
}
