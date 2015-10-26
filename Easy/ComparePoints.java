import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ComparePoints {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int o = Integer.parseInt(line.split(" ")[0]);
            int p = Integer.parseInt(line.split(" ")[1]);
            int q = Integer.parseInt(line.split(" ")[2]);
            int r = Integer.parseInt(line.split(" ")[3]);
            String result="";
            if(p<r)
            	result+="N";
            else if(p>r)
            	result+="S";
            if(o<q)
            	result+="E";
            else if(o>q)
            	result+="W";
            System.out.println((result.length()==0)?"here":result);
        }
    }
}
