import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RacingChars {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int prev=0;
        while ((line = buffer.readLine()) != null) {
        	int next=0;
            if(line.contains("C")){
            	next = line.indexOf("C");
            	if(prev==0 || prev==next)
            		line=line.replace("C","|");
            	else if (prev>next)
            		line=line.replace("C","/");
            	else if (prev<next)
            		line=line.replace("C","\\");
            } else if(line.contains("_")){
            	next = line.indexOf("_");
            	if(prev==0 || prev==next)
            		line=line.replace("_","|");
            	else if (prev>next)
            		line=line.replace("_","/");
            	else if (prev<next)
            		line=line.replace("_","\\");
            }
            prev=next;
            System.out.println(line);
        }
    }
}
