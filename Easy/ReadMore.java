import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadMore {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            if(line.length()>55) {
            	line = line.substring(0,40);
            	int index=line.length();
            	if(line.contains(" "))
            		index = line.lastIndexOf(" ");
            	line = line.substring(0,index).trim() + "... <Read More>";
            }
            System.out.println(line);
        }
    }
}
