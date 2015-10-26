import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LowestUniqueNumber {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String[] values=line.trim().split(" ");
        	boolean found=false;
        	for(int i=1;i<=9;i++){
        		int occurance=0;
        		int location=0;
        		for(int j=0;j<values.length;j++){
        			if(i==Integer.parseInt(values[j])){
        				occurance++;
        				if(occurance>1){
        					break;
        				} else {
        					location=j;
        				}
        			}
        		}
        		if(occurance==1){
        			System.out.println(location+1);
        			found=true;
        			break;
        		}
        	}
        	if(!found){
        		System.out.println(0);
        	}
        }
    }
}
