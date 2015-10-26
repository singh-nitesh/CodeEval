import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReverseWords {
    public static void main (String[] args) throws IOException {
        File file = new File("c:\\bbb.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] input = line.split(" ");
            String output = "";
            for(int i=input.length;i>0;i--){
            	output=output+input[i-1]+" ";
            }
            System.out.println(output.trim());
        }
    }
}
