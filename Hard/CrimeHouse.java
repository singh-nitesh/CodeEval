import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CrimeHouse {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split("; ")[1].split("\\|");
            int count =0;
            boolean isStrated=false;
            for(int i=0;i<input.length;i++){
            	if(input[i].split(" ")[0].equalsIgnoreCase("L") && isStrated==true){
            		count--;
            	} else if(input[i].split(" ")[0].equalsIgnoreCase("E"))	{
            		isStrated=true;
            		count++;
            	}
            }
            System.out.println(isStrated?(count>=0?count:"CRIME TIME"):"CRIME TIME");
        }
    }
}
