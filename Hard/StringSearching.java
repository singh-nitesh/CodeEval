import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StringSearching {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String input = line.split(",")[0];
            String val = line.split(",")[1];
            boolean result=false;
            if(input.contains(val)){
            	result=true;
            } else {
            	if(val.contains("\\*")){
            		val=val.replace("\\*", "*");
            		if(input.contains(val)){
                    	result=true;
                    }
            	} else if(val.contains("*")){
            		String[] vals = val.split("\\*");
            		int i=0;
            		for(i=0;i<vals.length;i++){
            			if(!input.contains(vals[i])){
            				break;
            			} else {
            				input.substring(input.indexOf(vals[i])+vals[i].length());
            			}
            		}
            		if(i==vals.length){
            			result=true;
            		}
            	}
            }
            System.out.println(result);
        }
    }
}
