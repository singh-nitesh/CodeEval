import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SwapNumbers {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            String result="";
            for(int i=0;i<input.length;i++){
            	char[] val = input[i].toCharArray();
            	char temp = val[0];
            	val[0] = val[val.length-1];
            	val[val.length-1] = temp;
            	result+=String.valueOf(val)+" ";
            }
            System.out.println(result.trim());
        }
    }
}
