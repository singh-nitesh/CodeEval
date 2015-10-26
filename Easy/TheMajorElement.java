import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TheMajorElement {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String[] inputs = line.split(",");
        	String result="";
        	for(int i=0;i<inputs.length;i++){
        		int count=1;
        		if(inputs[i].length()>0){
	        		for(int j=i+1;j<inputs.length;j++){
	        			if(inputs[i].equalsIgnoreCase(inputs[j])){
	        				inputs[j]="";
	        				count++;
	        			}
	        		}
        		}
        		if(count>(inputs.length/2)){
        			result=inputs[i];
        			break;
        		}
        	}
        	System.out.println(result.length()>0?result:"None");
        }
    }
}
