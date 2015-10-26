import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class PointInCircle {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            float x= Float.parseFloat(line.split("; ")[0].substring(9,line.split("; ")[0].indexOf(',')));
            float y= Float.parseFloat(line.split("; ")[0].substring(line.split("; ")[0].indexOf(',')+1,line.split("; ")[0].length()-1));
            float r = Float.parseFloat(line.split("; ")[1].substring(8));
            float x1= Float.parseFloat(line.split("; ")[2].substring(8,line.split("; ")[2].indexOf(',')));
            float y1= Float.parseFloat(line.split("; ")[2].substring(line.split("; ")[2].indexOf(',')+1,line.split("; ")[2].length()-1));
            
            float difX=Math.abs(x-x1);
            float difY=Math.abs(y-y1);
            
            double result = Math.sqrt((difX*difX)+(difY*difY));
            
            System.out.println(result<r);
        }
    }
}
