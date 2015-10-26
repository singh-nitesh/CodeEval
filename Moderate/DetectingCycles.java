import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DetectingCycles {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] inputs = line.split(" ");
            int startIndex=-1;
            int endIndex=-1;
            for(int i=0;i<inputs.length-1;i++){
            	for(int j=i+1;j<inputs.length;j++){
            		if(inputs[i].equalsIgnoreCase(inputs[j])){
            			startIndex=i;
            			endIndex=j;
            			break;
            		}
            	}
            	if(startIndex!=-1){
            		break;
            	}
            }
            String result="";
            for(int i=startIndex;i<endIndex;i++){
            	result+=inputs[i]+" ";
            }
            System.out.println(result.trim());
        }
    }
}
