import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CompressedSequence {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] inputs = line.split(" ");
            int count=0;
            String val="";
            String result="";
            for(int i=0;i<inputs.length;i++){
            	if(val.equals(inputs[i])){
            		count++;
            	} else {
            		if(count>=1)
            			result=result + String.valueOf(count)+" "+val+" ";
            		count=1;
            		val=inputs[i];
            	}
            }
            result=result + String.valueOf(count)+" "+val+" ";
            System.out.println(result.trim());
        }
    }
}
