import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class NiceAngels {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            double val = Double.parseDouble(line);
            int d=(int)val;
            int min =(int)((val-d)*60);
            int sec = (int)(((double)(val-d)-(double)(min/60.0)) * 3600);
            String minString=String.valueOf(min);
            if(minString.length()==1){
            	minString="0"+minString;
            }
            String secString=String.valueOf(sec);
            if(secString.length()==1){
            	secString="0"+secString;
            }
            System.out.println(d+"."+minString+"'"+secString+"\"");
        }
    }
}
