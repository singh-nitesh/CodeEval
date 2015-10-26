import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class WordChain {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(",");
            int maxCount=0;
            for(int i=0;i<input.length;i++){
            	String val=input[i];
            	String[] vals = input;
            	int count=0;
            	for(int j=0;j<vals.length;j++){
            		if(!val.equals(vals[j]) && !vals[j].equals("0")){
            			if(val.charAt(val.length()-1)==vals[j].charAt(0)){
            				count++;
            				val =  vals[j];
            				vals[j]="0";
            				j=0;
            			}
            		} else {
            			vals[j]="0";
            		}
            	}
            	if(count>maxCount){
            		maxCount=count;
            	}
            }
            System.out.println(maxCount==0?"None":maxCount+1);
        }
    }
}
