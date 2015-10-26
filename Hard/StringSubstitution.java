import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StringSubstitution {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String input = line.split(";")[0];
            String[] array = line.split(";")[1].split(",");
            for(int i=1;i<array.length;i+=2){
            	String val = array[i-1];
            	String val1 = array[i];
            	val1=val1.replace('0','a');
            	val1=val1.replace('1','b');
            	if(input.contains(val)){
            		input = input.replace(val, val1);
            	}
            }
            input=input.replace('a', '0');
            input=input.replace('b', '1');
            System.out.println(input);
        }
    }
}
