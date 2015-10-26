import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SplitTheNumber {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String[] inputs = line.split(" ");
        	int val1=0;
        	int val2=0;
        	boolean isAdd = false;
        	int val=0;
        	if(line.contains("+")){
        		val = inputs[1].split("\\+")[0].length();
        		isAdd=true;
        	} else {
        		val = inputs[1].split("\\-")[0].length();
        	}
    		val1=Integer.parseInt(inputs[0].substring(0, val)); 
    		val2=Integer.parseInt(inputs[0].substring(val)); 
        	if(isAdd){
        		System.out.println(val1+val2);
        	} else {
        		System.out.println(val1-val2);
        	}
        }
    }
}
